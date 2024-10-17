package auth.model;

import java.time.LocalDateTime;
import java.util.Set;

public class User {

    private String login;
    private String senha;  // Senha geralmente deve ser criptografada
    private String nomeCompleto;
    private Set<String> roles;  // Ex: "Admin", "User"
    private boolean ativo;  // Conta ativa ou não
    private LocalDateTime ultimoLogin;
    private LocalDateTime dataCriacao;

}
