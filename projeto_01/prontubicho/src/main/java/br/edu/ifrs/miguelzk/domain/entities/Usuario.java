package br.edu.ifrs.miguelzk.domain.entities;

//import java.util.Date;
import java.util.Collection;
import java.util.Set;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


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
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idUsuario;

    private String nome;
//    private Date dataNascimento;
//    private Date dataCadastro;

    @ElementCollection
    @CollectionTable(name="emails")
    private Set<String> emails;

    @Setter
    @Getter
    @ManyToMany(mappedBy = "usuarios")
    private Set<Animal> animais;

}
