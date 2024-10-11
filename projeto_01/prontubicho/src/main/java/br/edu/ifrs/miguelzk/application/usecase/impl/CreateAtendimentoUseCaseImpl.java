package br.edu.ifrs.miguelzk.application.usecase.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import br.edu.ifrs.miguelzk.application.dto.AtendimentoRequestDTO;
import br.edu.ifrs.miguelzk.application.dto.AtendimentoResponseDTO;
import br.edu.ifrs.miguelzk.application.usecase.CreateAtendimentoUseCase;
import br.edu.ifrs.miguelzk.domain.entities.Atendimento;
import br.edu.ifrs.miguelzk.domain.entities.AtendimentoItem;
import br.edu.ifrs.miguelzk.domain.entities.Animal;
import br.edu.ifrs.miguelzk.domain.repository.UsuarioRepository;
import br.edu.ifrs.miguelzk.domain.repository.AtendimentoRepository;
import br.edu.ifrs.miguelzk.domain.repository.AnimalRepository;

public class CreateAtendimentoUseCaseImpl implements CreateAtendimentoUseCase {

  private AtendimentoRepository atendimentoRepository;
  private UsuarioRepository usuarioRepository;
  private AnimalRepository animalRepository;
  private ModelMapper modelMapper;

  public CreateAtendimentoUseCaseImpl(AtendimentoRepository atendimentoRepository, UsuarioRepository usuarioRepository, AnimalRepository animalRepository, ModelMapper modelMapper) {
    this.atendimentoRepository = atendimentoRepository;
    this.usuarioRepository = usuarioRepository;
    this.animalRepository = animalRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public AtendimentoResponseDTO execute(AtendimentoRequestDTO atendimentoRequest) {
    Atendimento atendimento = new Atendimento();
    List<AtendimentoItem> items = atendimentoRequest.getItems().stream()
        .map(itemDTO -> {
          AtendimentoItem item = new AtendimentoItem();
          item.setQuantity(itemDTO.getQuantity());
          Animal animal = animalRepository.findByAnimalById(itemDTO.getAnimalId());
          item.setAnimal(animal);

          return item;
        }).collect(Collectors.toList());

    atendimento.setItems(items);
    atendimento.setUsuario(usuarioRepository.findUsuarioById(atendimentoRequest.getUsuarioId()));
    double total = items.stream()
        .mapToDouble(item -> item.getAnimal().getPrice() * item.getQuantity())
        .sum();
    atendimento.setTotal(total);
    Atendimento saveatendimento = atendimentoRepository.save(atendimento);

    return modelMapper.map(saveatendimento, AtendimentoResponseDTO.class);
  }

}
