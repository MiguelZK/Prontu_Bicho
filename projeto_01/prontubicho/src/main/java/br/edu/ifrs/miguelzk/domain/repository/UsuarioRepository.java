package br.edu.ifrs.miguelzk.domain.repository;

import java.util.List;
import br.edu.ifrs.miguelzk.domain.entities.Usuario;

public interface UsuarioRepository {
    
    Usuario findUsuarioById(Long id);
    List<Usuario> findUsuarioAll();
    List<Usuario> findUsuarioByName(String userName);
    Usuario save(Usuario usuario);
    Usuario update(Usuario usuario);
    void deleteUsuarioById(Long id);

    long contaUsuarios();
}
