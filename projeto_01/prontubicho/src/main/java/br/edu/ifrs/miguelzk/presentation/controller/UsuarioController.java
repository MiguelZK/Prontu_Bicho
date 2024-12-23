package br.edu.ifrs.miguelzk.presentation.controller;

import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import br.edu.ifrs.miguelzk.application.dto.UsuarioRequestDTO;
import br.edu.ifrs.miguelzk.application.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/usuario")
public class UsuarioController {

  @Inject
  UsuarioService usuarioService;

  @POST
//  @RolesAllowed("admin")
  @PermitAll
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response create(@RequestBody UsuarioRequestDTO request) {
    return Response.ok().entity(usuarioService.create(request)).build();
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response updateUsuario(@RequestBody UsuarioRequestDTO request) {
    return Response.ok().entity(usuarioService.updateUsuario(request)).build();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response findAll() {
    try {
      return Response.ok().entity(usuarioService.findUsuarioAll()).build();
    } catch (Exception e) {
      return Response.serverError().build();
    }
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response findById(@PathParam("id") Long id) {
    try {
      return Response.ok().entity(usuarioService.findUsuarioById(id)).build();
    } catch (Exception e) {
      return Response.serverError().build();
    }
  }

  @GET
  @Path("/{userName}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response findUsuarioByName(@PathParam("userName") String userName) {
    return Response.ok().entity(usuarioService.findUsuarioByName(userName)).build();
  }

  @DELETE
//  @RolesAllowed("admin")
  @PermitAll
  public Response deleteUsuarioById(Long id) {
    try {
      usuarioService.deleteUsuarioById(id);
      return Response.ok().build();
    } catch (Exception e) {
      return Response.serverError().build();
    }
  }
}
