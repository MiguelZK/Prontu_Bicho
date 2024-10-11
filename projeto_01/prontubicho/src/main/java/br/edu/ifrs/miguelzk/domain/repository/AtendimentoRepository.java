package br.edu.ifrs.miguelzk.domain.repository;

import java.util.List;
import br.edu.ifrs.miguelzk.domain.entities.Atendimento;

public interface AtendimentoRepository {
    
    Atendimento findByAtendimentoId(Long id);
    List<Atendimento> findAllAtendimento();
    Atendimento save(Atendimento atendimento);
    void deleteAtendimentoById(Long id);
}
