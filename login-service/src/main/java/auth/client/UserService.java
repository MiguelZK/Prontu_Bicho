package auth.client;

import auth.model.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

public interface UserService {
    /*
        // Aqui você conectaria com o banco de dados ou serviço externo
        public User validateUser(String login, String senha) {
            // Lógica de validação de usuário (ex: verificar login e senha)
            if ("usuario".equals(login) && "senha123".equals(senha)) {
                return new User(login);  // Usuário autenticado
            }
            return null;  // Usuário inválido
        }*/
    @RegisterRestClient(baseUri = "http://localhost:8081/api/usuario")
    public interface UserClient {

        @POST
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        @Produces(MediaType.APPLICATION_JSON)
        @Path("/findbylogin")
        public User findByLogin(@FormParam("login") String login, @FormParam("senha") String senha);
    }
}
