package br.edu.ifrs.miguelzk.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class MedVet extends Usuario {

    @Column(nullable = false, name = "idmedvet")
    private Long idMedVet;

    private int cmrv;
    private String especialidade;

    @ManyToMany(mappedBy = "medVets")
    private Set<Atendimento> atendimentos;
}
