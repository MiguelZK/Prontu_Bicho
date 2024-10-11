package br.edu.ifrs.miguelzk.application.dto;

import java.util.List;

//import org.hibernate.type.descriptor.java.DateJavaType;

import lombok.Data;

@Data
public class AtendimentoRequestDTO {
//    private DateJavaType dataAtendimento;
    private String relatoTutor;
    private String exameClinico;
    private String avaliacaoExames;
    private String diagnPresuntivo;
    private String diagnConclusivo;
    private String procedimentoRealizado;
    private String tratamentoInstituido;
    private String observarProxConsulta;
//    private List<DateJavaType> validacaoPelosTutores;

}
