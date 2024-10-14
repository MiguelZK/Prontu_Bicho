package br.edu.ifrs.miguelzk.domain.entities;

import java.util.Set;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@EqualsAndHashCode(callSuper = true)
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idUsuario;

    private String nome;

/*    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @CreationTimestamp
    private Date dataCadastro;

    @ElementCollection
    @CollectionTable(name="emails")
    private Set<String> emails;*/

    @ManyToMany(mappedBy = "usuarios")
    private Set<Animal> animais;

/*    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "idCpf")
    private Cpf cpf;

    @OneToMany
    @JoinColumn (name = "idTelefone")
    private Set<Telefone> telefones;

    @OneToMany
    @JoinColumn (name = "idEndereco")
    private Set<Endereco> enderecos;
 */
}
