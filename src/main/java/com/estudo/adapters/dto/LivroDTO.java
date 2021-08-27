package com.estudo.adapters.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
public class LivroDTO {

    private UUID id;
    private String nome;
    private String autor;
    private String descricao;
    private LocalDateTime dataHoraPublicacao;

}
