package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ususario {
  @Id
  private long id;
  @ManyToOne
  private CategoriaUsuario categoriaUsuario;
  private String nome;
  @ManyToOne
  private Empresa empresa;
  @ManyToOne
  private NivelAcesso nivelAcesso;
  @ManyToOne
  private JornadaTrabalho jornadaTrabalho;
  private BigDecimal tolerancia;
  private LocalTime inicioJornada;
  private LocalTime finalJornada;
}
