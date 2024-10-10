package br.edu.ifrs.miguelzk.domain.repository;

import java.util.List;
import br.edu.ifrs.miguelzk.domain.entities.Usuario;

public interface UsuarioRepository {
    
    Usuario findByUsuarioId(Long id);
    List<Usuario> findAllUsuario();
    Usuario save(Usuario usuario);
    void deleteUsuario(Long id);
}
