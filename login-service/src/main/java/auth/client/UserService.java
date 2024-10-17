package auth.client;

import auth.model.User;

public interface UserService {

    // Aqui você conectaria com o banco de dados ou serviço externo
    public User validateUser(String login, String senha) {
        // Lógica de validação de usuário (ex: verificar login e senha)
        if ("usuario".equals(login) && "senha123".equals(senha)) {
            return new User(login);  // Usuário autenticado
        }
        return null;  // Usuário inválido
    }
}
}
