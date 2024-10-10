package br.edu.ifrs.miguelzk.configuration;


import org.modelmapper.ModelMapper;
import br.edu.ifrs.miguelzk.application.usecase.CreateUsuarioUseCase;
import br.edu.ifrs.miguelzk.application.usecase.CreateAtendimentoUseCase;
import br.edu.ifrs.miguelzk.application.usecase.CreateAnimalUseCase;
import br.edu.ifrs.miguelzk.application.usecase.impl.CreateAnimalUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.DeleteUsuarioUseCase;
import br.edu.ifrs.miguelzk.application.usecase.DeleteAtendimentoUseCase;
import br.edu.ifrs.miguelzk.application.usecase.DeleteAnimalUseCase;
import br.edu.ifrs.miguelzk.application.usecase.FindUsuarioUseCase;
import br.edu.ifrs.miguelzk.application.usecase.FindAtendimentoUseCase;
import br.edu.ifrs.miguelzk.application.usecase.FindAnimalUseCase;
import br.edu.ifrs.miguelzk.application.usecase.impl.DeleteUsuarioUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.impl.DeleteAtendimentoUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.impl.DeleteAnimalUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.impl.FindUsuarioUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.impl.FindAtendimentoUseCaseImpl;
import br.edu.ifrs.miguelzk.application.usecase.impl.FindAnimalUseCaseImpl;
import br.edu.ifrs.miguelzk.domain.repository.UsuarioRepository;
import br.edu.ifrs.miguelzk.domain.repository.AtendimentoRepository;
import br.edu.ifrs.miguelzk.domain.repository.AnimalRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class UseCaseConfig {

  @Produces
  public CreateAnimalUseCase createAnimalUseCase(AnimalRepository animalRepository, ModelMapper modelMapper) {
    return new CreateAnimalUseCaseImpl(animalRepository, modelMapper);
  }

  @Produces
 public CreateUsuarioUseCase createUsuarioUseCase(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
   return new CreateUsuarioUseCaseImpl(usuarioRepository, modelMapper);
  }

  @Produces
 public CreateAtendimentoUseCase createAtendimentoUseCase(AtendimentoRepository atendimentoRepository, UsuarioRepository usuarioRepository, AnimalRepository animalRepository, ModelMapper modelMapper) {
   return new CreateAtendimentoUseCaseImpl(atendimentoRepository, usuarioRepository, animalRepository, modelMapper);
  }

  @Produces
  public FindAnimalUseCase findAnimalUseCase(AnimalRepository animalRepository, ModelMapper modelMapper) {
    return new FindAnimalUseCaseImpl(animalRepository, modelMapper);
  }

  @Produces
  public DeleteAnimalUseCase deleteAnimalUseCase(AnimalRepository animalRepository) {
    return new DeleteAnimalUseCaseImpl(animalRepository);
  }

  @Produces
 public FindUsuarioUseCase findUsuarioUseCase(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
   return new FindUsuarioUseCaseImpl(usuarioRepository, modelMapper);
  }

  @Produces
 public DeleteUsuarioUseCase deleteUsuarioUseCase(UsuarioRepository usuarioRepository) {
   return new DeleteUsuarioUseCaseImpl(usuarioRepository);
  }

  @Produces
 public FindAtendimentoUseCase findAtendimentoUseCase(AtendimentoRepository atendimentoRepository, ModelMapper modelMapper) {
   return new FindAtendimentoUseCaseImpl(atendimentoRepository, modelMapper);
  }

  @Produces
 public DeleteAtendimentoUseCase deleteAtendimentoUseCase(AtendimentoRepository atendimentoRepository) {
   return new DeleteAtendimentoUseCaseImpl(atendimentoRepository);
  }

}