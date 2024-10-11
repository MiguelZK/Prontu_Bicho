package br.edu.ifrs.miguelzk.application.dto;

//import org.hibernate.type.descriptor.java.DateJavaType;

import br.edu.ifrs.miguelzk.application.enums.PorteCachorro;
import lombok.Data;

@Data
public class AnimalResponseDTO {

    private Long id;
    private String idMicrochip;
//    private DateJavaType dataCriacao;
//    private DateJavaType dataNascimento;
//    private DateJavaType dataFalecimento;
//    private Boolean idadeAproximada;
//    private String temperamento;
//    private String cor;
//    private String sinaisParticulares;
    private Double peso;
//    private String tipoPelagem;
    private String descricao;
    private PorteCachorro porteCachorro;

}
