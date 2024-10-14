package br.edu.ifrs.miguelzk.domain.repository;

import java.util.List;
import br.edu.ifrs.miguelzk.domain.entities.Usuario;

public interface UsuarioRepository {
    
    Usuario findUsuarioById(Long id);
    List<Usuario> findUsuarioAll();
    Usuario save(Usuario usuario);
    void deleteUsuarioById(Long id);
}
