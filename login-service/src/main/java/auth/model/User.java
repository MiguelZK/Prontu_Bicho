package auth.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode
public class User {

    private String login;
    private String senha;  // Senha geralmente deve ser criptografada
    private String nomeCompleto;
    private Set<String> roles;  // Ex: "Admin", "User"
    private boolean ativo;  // Conta ativa ou não
    private LocalDateTime ultimoLogin;
    private LocalDateTime dataCriacao;

}
