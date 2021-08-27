package com.estudo.adapters.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class LivroDTO {

    private String nome;
    private String autor;
    private String descricao;
    private LocalDateTime dataHoraPublicacao;

}
