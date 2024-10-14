package br.edu.ifrs.miguelzk.presentation.controller;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import br.edu.ifrs.miguelzk.application.dto.UsuarioRequestDTO;
import br.edu.ifrs.miguelzk.application.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/usuario")
public class UsuarioController {

  @Inject
  UsuarioService usuarioService;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response create(@RequestBody UsuarioRequestDTO request) {
    return Response.ok().entity(usuarioService.create(request)).build();
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

  @DELETE
  public Response deleteUsuarioById(Long id) {
    try {
      usuarioService.deleteUsuarioById(id);
      return Response.ok().build();
    } catch (Exception e) {
      return Response.serverError().build();
    }
  }

}
