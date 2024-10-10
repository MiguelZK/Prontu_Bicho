package br.edu.ifrs.miguelzk.domain.entities;

import java.util.List;

import org.hibernate.type.descriptor.java.DateJavaType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Atendimento extends PanacheEntity{
    private DateJavaType dataAtendimento;
    private String relatoTutor;
    private String exameClinico;
    private String avaliacaoExames;
    private String diagnPresuntivo;
    private String diagnConclusivo;
    private String procedimentoRealizado;
    private String tratamentoInstituido;
    private String observarProxConsulta;
    private List<DateJavaType> validacaoPelosTutores;
}
