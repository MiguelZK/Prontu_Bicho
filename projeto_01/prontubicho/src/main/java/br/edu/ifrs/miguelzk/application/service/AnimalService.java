package br.edu.ifrs.miguelzk.application.service;

import java.util.List;
import br.edu.ifrs.miguelzk.application.dto.AnimalRequestDTO;
import br.edu.ifrs.miguelzk.application.dto.AnimalResponseDTO;
import br.edu.ifrs.miguelzk.application.usecase.CreateAnimalUseCase;
import br.edu.ifrs.miguelzk.application.usecase.DeleteAnimalUseCase;
import br.edu.ifrs.miguelzk.application.usecase.FindAnimalUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AnimalService {

  private final CreateAnimalUseCase createAnimalUseCase;

  private final FindAnimalUseCase findAnimalUseCase;

  private final DeleteAnimalUseCase deleteAnimalUseCase;

  @Inject
  public AnimalService(CreateAnimalUseCase createAnimalUseCase, FindAnimalUseCase findAnimalUseCase,
      DeleteAnimalUseCase deleteAnimalUseCase) {
    this.createAnimalUseCase = createAnimalUseCase;
    this.findAnimalUseCase = findAnimalUseCase;
    this.deleteAnimalUseCase = deleteAnimalUseCase;
  }

  @Transactional
  public AnimalResponseDTO createAnimal(AnimalRequestDTO request) {
    return createAnimalUseCase.execute(request);
  }

  public List<AnimalResponseDTO> findAllAnimal(){
    return findAnimalUseCase.execute();
  }

  public AnimalResponseDTO findAnimalById(Long id) {
    return findAnimalUseCase.execute(id);
  }

  @Transactional
  public void deleteAnimalById(Long id) {
    deleteAnimalUseCase.execute(id);
  }

}
