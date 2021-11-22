package com.estudo.application.service;

import com.estudo.adapters.dto.LivroDTO;
import com.estudo.application.ports.LivroServicePort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class LivroService implements LivroServicePort {

    public List<LivroDTO> getLivros() {
        return Collections
                .singletonList(
                        LivroDTO.builder()
                                .autor("Lucas Barros Santos")
                                .nome("!!! CodeDeploy na AWS !!!")
                                .dataHoraPublicacao(LocalDateTime.now())
                                .descricao("")
                                .build());
    }

}
