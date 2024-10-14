package br.edu.ifrs.miguelzk.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class MedVet extends Usuario {

    @Column(nullable = false)
    private int cmrv;

    private String especialidade;

    @ManyToMany(mappedBy = "medVets")
    private Set<Atendimento> atendimentos;
}
