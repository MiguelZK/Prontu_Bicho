package br.edu.ifrs.miguelzk.domain.repository.impl;

import java.util.List;

import br.edu.ifrs.miguelzk.domain.entities.Animal;
import br.edu.ifrs.miguelzk.domain.repository.AnimalRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnimalRepositoryImpl implements AnimalRepository, PanacheRepositoryBase<Animal, Long> {

  @Override
  public Animal findByAnimalId(Long id) {
    return findById(id);
  }

  @Override
  public List<Animal> findAllAnimal() {
    return listAll();
  }

  @Override
  public Animal save(Animal animal) {
    persist(animal);
    return animal;
  }

  @Override
  public void deleteAnimal(Long id) {
    deleteById(id);
  }

}
