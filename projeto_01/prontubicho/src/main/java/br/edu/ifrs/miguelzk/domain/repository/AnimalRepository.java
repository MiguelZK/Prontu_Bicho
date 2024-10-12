package br.edu.ifrs.miguelzk.domain.repository;

import java.util.List;
import br.edu.ifrs.miguelzk.domain.entities.Animal;

public interface AnimalRepository {
    
    Animal findByAnimalId(Long idAnimal);
    List<Animal> findAllAnimal();
    Animal save(Animal animal);
    void deleteAnimal(Long id);
}
