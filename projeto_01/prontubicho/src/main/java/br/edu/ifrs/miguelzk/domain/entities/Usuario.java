package br.edu.ifrs.miguelzk.domain.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@EqualsAndHashCode(callSuper = true)
@UserDefinition
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long idUsuario;

    @NotBlank(message = "Login é obrigatório")
    @Column(unique = true)
    @Username
    private String userName;

    @NotBlank(message = "Senha é obrigatória")
    @Password
    @JsonIgnore
    private String password;

    @Roles
    private String role;

    private String nomeCompleto;

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

    public static void add(String userName, String password, String role) {
        Usuario usuario = new Usuario();
        usuario.userName = userName;
        usuario.password = BcryptUtil.bcryptHash(password);
        usuario.role = role;
    }
}
