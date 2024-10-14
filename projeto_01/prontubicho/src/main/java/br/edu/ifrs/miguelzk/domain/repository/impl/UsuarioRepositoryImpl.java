package br.edu.ifrs.miguelzk.domain.repository.impl;

import java.util.List;

import br.edu.ifrs.miguelzk.domain.entities.Usuario;
import br.edu.ifrs.miguelzk.domain.repository.UsuarioRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepositoryImpl implements UsuarioRepository, PanacheRepositoryBase<Usuario, Long> {

  @Override
  public Usuario findUsuarioById(Long id) {
    return findById(id);
  }

  public Usuario save(Usuario usuario) {
    persist(usuario);
    return usuario;
  }

  @Override
  public List<Usuario> findUsuarioAll() {
    return listAll();
  }

  @Override
  public void deleteUsuarioById(Long id) {
    deleteById(id);
  }

}
