package com.estudo.application.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
public class Livro {

    private UUID id;
    private String nome;
    private String autor;
    private String descricao;
    private LocalDateTime dataHoraPublicacao;

}
