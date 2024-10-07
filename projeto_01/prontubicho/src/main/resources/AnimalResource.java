import jakarta.ws.rs.Produces;

import org.hibernate.mapping.List;

import br.edu.ifrs.miguelzk.entities.Animal;
import jakarta.ws.rs.GET;
import lombok.Getter;

@Path("/animal")
public class AnimalResource {

    @GET
    @Produces(MediaType.APPLICATION_JASON)
    public List<Animal> list() {
        return Animal.listAll();
    }

}
