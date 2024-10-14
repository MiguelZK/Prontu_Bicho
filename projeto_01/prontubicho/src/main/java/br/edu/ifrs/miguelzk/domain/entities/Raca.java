package br.edu.ifrs.miguelzk.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Raca extends PanacheEntityBase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idRaca;

    @Column(nullable = false)
    private String nomeRaca;

    @OneToOne(optional = false)
    private Especie especie;
}
