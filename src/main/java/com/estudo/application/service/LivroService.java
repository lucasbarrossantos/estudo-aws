package com.estudo.application.service;

import com.estudo.adapters.dto.LivroDTO;
import com.estudo.application.ports.LivroServicePort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class LivroService implements LivroServicePort {

    public List<LivroDTO> getLivros() {
        return Collections
                .singletonList(
                        LivroDTO.builder()
                                .id(UUID.randomUUID())
                                .autor("Lucas Barros Santos")
                                .nome("Aprendendo cloud")
                                .dataHoraPublicacao(LocalDateTime.now())
                                .descricao("Livro para quem quer aprender cloud")
                                .build());
    }

}
