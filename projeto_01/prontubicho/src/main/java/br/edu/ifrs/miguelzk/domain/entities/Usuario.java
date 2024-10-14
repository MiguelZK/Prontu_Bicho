package br.edu.ifrs.miguelzk.domain.entities;

//import java.util.Date;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@EqualsAndHashCode(callSuper = true)
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idUsuario;

    private String nome;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @CreationTimestamp
    private Date dataCadastro;

    @ElementCollection
    @CollectionTable(name="emails")
    private Set<String> emails;

    @Setter
    @Getter
    @ManyToMany(mappedBy = "usuarios")
    private Set<Animal> animais;

}
