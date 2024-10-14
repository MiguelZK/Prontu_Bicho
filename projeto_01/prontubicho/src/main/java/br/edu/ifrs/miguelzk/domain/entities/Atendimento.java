package br.edu.ifrs.miguelzk.domain.entities;

import java.util.Date;
import java.util.Set;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Atendimento extends PanacheEntityBase {
//    private DateJavaType dataAtendimento;

    @Id
    @GeneratedValue
    private Long idAtendimento;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAtendimento;

    @CreationTimestamp
    private Date dataCadastro;

    private String relatoTutor;
    private String exameClinico;
    private String avaliacaoExames;
    private String diagnPresuntivo;
    private String diagnConclusivo;
    private String procedimentoRealizado;
    private String tratamentoInstituido;
    private String observarProxConsulta;
//    private List<DateJavaType> validacaoPelosTutores;

    @ManyToOne
    @JoinColumn(name="idAnimal")
    private Animal animal;

    @ManyToMany
    @JoinTable( name="atendim_usuarios",
            joinColumns={ @JoinColumn(name="idAtendimento")},
            inverseJoinColumns={@JoinColumn(name="idUsuario")})
    private Set<Usuario> usuarios;

    @ManyToMany
    @JoinTable( name="atendim_medvets",
            joinColumns={ @JoinColumn(name="idAtendimento")},
            inverseJoinColumns={@JoinColumn(name="cmrv")})
    private Set<MedVet> medVets;
}
