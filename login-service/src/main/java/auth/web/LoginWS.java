package auth.web;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.HashSet;

import auth.client.UserService;
import auth.model.User;
import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/login")
public class LoginWS {

    @Inject
    UserService userService; // Serviço que valida o usuário

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@FormParam("login") String login, @FormParam("senha") String senha) {
        User user = userService.validateUser(login, senha);

        if (user == null) {
            throw new WebApplicationException("Login ou senha incorretos", 403);
        }

        // Defina a duração do token JWT (ex: 30 minutos)
        LocalDateTime expirationTime = LocalDateTime.now().plusMinutes(30);
        long expirationTimestamp = expirationTime.toEpochSecond(ZoneOffset.UTC);

        String token = Jwt.issuer("http://localhost:8080")
                .upn(login)
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .expiresAt(expirationTimestamp)
                .sign();

        return Response.ok().entity("{\"token\":\"" + token + "\"}").build();
    }
}
