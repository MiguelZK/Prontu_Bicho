package br.edu.ifrs.miguelzk.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import br.edu.ifrs.miguelzk.application.enums.PorteCachorro;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Animal extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idAnimal;

    private String idMicrochip;

/*    private Date dataCriacao;
    private Date dataNascimento;
    private Date dataFalecimento;
    private Boolean idadeAproximada;
    @Column(nullable = false)
    private String temperamento;
    @Column(nullable = false)
    private String cor;
    @Column(nullable = false)
    private String sinaisParticulares;
    @Column(nullable = false)
    private String tipoPelagem;
 */
    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private String descricao;
    private PorteCachorro porteCachorro;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable( name="animal_usuario",
            joinColumns={ @JoinColumn(name="idUsuario")},
            inverseJoinColumns={@JoinColumn(name="idAnimal")})
    private Set<Usuario> Usuarios;

    @OneToMany(mappedBy = "idanimal")
    @JoinColumn(name="idatendimento")
    private Set<Atendimento> atendimentos;

}
