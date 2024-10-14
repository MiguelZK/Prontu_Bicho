package br.edu.ifrs.miguelzk.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class VinculoUsuarioAnimal extends PanacheEntity {
    private String nomeAnimal;
//    private Date inicioVinculo;
//    private Date fimVinculo;
//    private Set<Animal> animais;
}
