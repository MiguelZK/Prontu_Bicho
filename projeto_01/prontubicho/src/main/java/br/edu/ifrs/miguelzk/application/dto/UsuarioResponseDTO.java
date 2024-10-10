package br.edu.ifrs.miguelzk.application.dto;

import java.util.List;

import org.hibernate.type.descriptor.java.DateJavaType;

import lombok.Data;

@Data
public class UsuarioResponseDTO {
  private Long id;
  private String nome;
  private DateJavaType dataNascimento;
  private DateJavaType dataCadastro;
  private List<String> emails;

}
