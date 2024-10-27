package br.edu.ifrs.miguelzk.application.usecase;

import java.util.List;

import br.edu.ifrs.miguelzk.application.dto.UsuarioResponseDTO;

public interface FindUsuarioUseCase {

  UsuarioResponseDTO execute(Long id);

  List<UsuarioResponseDTO> execute(String userName);

  List<UsuarioResponseDTO> execute();

}
