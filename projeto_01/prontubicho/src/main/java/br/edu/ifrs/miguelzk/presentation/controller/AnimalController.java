package br.edu.ifrs.miguelzk.presentation.controller;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import br.edu.ifrs.miguelzk.application.dto.AnimalRequestDTO;
import br.edu.ifrs.miguelzk.application.service.AnimalService;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/api/animal")
public class AnimalController {

  @Inject
  private AnimalService animalService;

  @POST
  public Response createAnimal(@RequestBody AnimalRequestDTO request) {
    return Response.ok().entity(animalService.createAnimal(request)).build();
  }

  @GET
  public Response findAllAnimal() {
    return Response.ok().entity(animalService.findAnimalAll()).build();
  }

  @GET
  @Path("/{id}")
  public Response findAnimalById(@PathParam("id") Long id) {
    return Response.ok().entity(animalService.findAnimalById(id)).build();
  }

  @DELETE
  @Path("/{id}")
  public Response deleteAnimalById(@PathParam("id") Long id) {
    try {
      animalService.deleteAnimalById(id);
      return Response.ok().build();
    } catch (Exception e) {
     return Response.serverError().build();
    }
  }

}
