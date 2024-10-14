package br.edu.ifrs.miguelzk.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Telefone extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Integer idTelefone;

    private int ddi;
    private int ddd;
    private int numero;
    private String tipo;

/*    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "idUsuario")
    private Usuario usuario;*/
}
