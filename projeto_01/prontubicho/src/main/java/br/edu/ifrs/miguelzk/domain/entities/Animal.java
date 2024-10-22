package br.edu.ifrs.miguelzk.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import br.edu.ifrs.miguelzk.domain.enums.PorteCachorro;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Animal extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idAnimal;

    private String nomeAnimal;
/*    private String idMicrochip;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @CreationTimestamp
    private Date dataCadastro;

    @Temporal(TemporalType.DATE)
    private Date dataFalecimento;

    private Boolean idadeAproximada;
    private Boolean comunitario;

    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "idEspecie")
    private Especie especie;

    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "idRaca")
    private Raca raca;

    @Column(nullable = false)
    private String temperamento;

    @Column(nullable = false)
    private String cor;

    @Column(nullable = false)
    private String sinaisParticulares;

    @Column(nullable = false)
    private String tipoPelagem;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private String descricao;*/


    @Enumerated(EnumType.STRING)
    private PorteCachorro porteCachorro;

    @ManyToMany(cascade = CascadeType.PERSIST, targetEntity = Usuario.class)
    @JoinTable( name="animal_usuario",
            joinColumns={ @JoinColumn(name="idAnimal")},
            inverseJoinColumns={@JoinColumn(name="idUsuario")})
    private Set<Usuario> usuarios;

    @OneToMany(mappedBy = "animal")
    private Set<Atendimento> atendimentos;

    public Animal(String nomeAnimal, String porteCachorro) {
        this.nomeAnimal = nomeAnimal;
        this.porteCachorro = PorteCachorro.valueOf(porteCachorro);
        this.usuarios = new HashSet<>();
        this.atendimentos = new HashSet<>();
    }

    public Animal() {}
}
