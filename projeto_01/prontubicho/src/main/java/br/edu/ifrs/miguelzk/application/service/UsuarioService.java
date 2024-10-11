package br.edu.ifrs.miguelzk.application.service;

import java.util.List;
import br.edu.ifrs.miguelzk.application.dto.UsuarioRequestDTO;
import br.edu.ifrs.miguelzk.application.dto.UsuarioResponseDTO;
import br.edu.ifrs.miguelzk.application.usecase.CreateUsuarioUseCase;
import br.edu.ifrs.miguelzk.application.usecase.DeleteUsuarioUseCase;
import br.edu.ifrs.miguelzk.application.usecase.FindUsuarioUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UsuarioService {

  private final CreateUsuarioUseCase createUsuarioUseCase;
  private final FindUsuarioUseCase findUsuarioUseCase;
  private final DeleteUsuarioUseCase deleteUsuarioUseCase;

  @Inject
  public UsuarioService(CreateUsuarioUseCase createUsuarioUseCase, FindUsuarioUseCase findUsuarioUseCase
      , DeleteUsuarioUseCase deleteUsuarioUseCase) {
    this.createUsuarioUseCase = createUsuarioUseCase;
    this.findUsuarioUseCase = findUsuarioUseCase;
    this.deleteUsuarioUseCase = deleteUsuarioUseCase;
  }

  @Transactional
  public UsuarioResponseDTO create(UsuarioRequestDTO request) {
    return createUsuarioUseCase.execute(request);
  }

  public List<UsuarioResponseDTO> findAllUsuario() {
    return findUsuarioUseCase.execute();
  }

  public UsuarioResponseDTO findUsuarioById(Long id) {
    return findUsuarioUseCase.execute(id);
  }

  public void deleteUsuarioById(Long id) {
    deleteUsuarioUseCase.execute(id);
  }

}
