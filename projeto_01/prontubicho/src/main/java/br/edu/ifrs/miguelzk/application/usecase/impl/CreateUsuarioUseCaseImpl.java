package br.edu.ifrs.miguelzk.application.usecase.impl;

import org.modelmapper.ModelMapper;
import br.edu.ifrs.miguelzk.application.dto.UsuarioRequestDTO;
import br.edu.ifrs.miguelzk.application.dto.UsuarioResponseDTO;
import br.edu.ifrs.miguelzk.application.usecase.CreateUsuarioUseCase;
import br.edu.ifrs.miguelzk.domain.entities.Usuario;
import br.edu.ifrs.miguelzk.domain.repository.UsuarioRepository;

public class CreateUsuarioUseCaseImpl implements CreateUsuarioUseCase {

  private final UsuarioRepository usuarioRepository;
  private final ModelMapper modelMapper;

  public CreateUsuarioUseCaseImpl(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
    this.usuarioRepository = usuarioRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public UsuarioResponseDTO execute(UsuarioRequestDTO request) {
    Usuario usuario = modelMapper.map(request, Usuario.class);
    Usuario saveAtendimento = usuarioRepository.saveAtendimento(usuario);
    return modelMapper.map(saveAtendimento, UsuarioResponseDTO.class);
  }

}
