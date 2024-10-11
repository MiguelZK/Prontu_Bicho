package br.edu.ifrs.miguelzk.domain.entities;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.type.descriptor.java.DateJavaType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Atendimento extends PanacheEntityBase {
//    private DateJavaType dataAtendimento;

    @Id
    @GeneratedValue
    private Long idAtendimento;
    private String relatoTutor;
    private String exameClinico;
    private String avaliacaoExames;
    private String diagnPresuntivo;
    private String diagnConclusivo;
    private String procedimentoRealizado;
    private String tratamentoInstituido;
    private String observarProxConsulta;
//    private List<DateJavaType> validacaoPelosTutores;
    @ManyToOne
    @JoinColumn(name="idanimal")
    private Animal animal;
}
