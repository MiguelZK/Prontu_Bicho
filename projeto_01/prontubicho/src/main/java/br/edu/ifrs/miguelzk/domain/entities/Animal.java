package br.edu.ifrs.miguelzk.domain.entities;

import org.hibernate.type.descriptor.java.DateJavaType;

import br.edu.ifrs.miguelzk.application.enums.PorteCachorro;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Animal extends PanacheEntity{
    private String idMicrochip;
    private DateJavaType dataCriacao;
    private DateJavaType dataNascimento;
    private DateJavaType dataFalecimento;
    private Boolean idadeAproximada;
    private String temperamento;
    private String cor;
    private String sinaisParticulares;
    private Double peso;
    private String tipoPelagem;
    private String descricao;
    private PorteCachorro porteCachorro;
}
