package com.estudo.adapters.web.controller;

import com.estudo.adapters.dto.LivroDTO;
import com.estudo.application.domain.Livro;
import com.estudo.application.ports.LivroServicePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LivroController {

    private final LivroServicePort livroServicePort;

    @GetMapping
    public ResponseEntity<List<LivroDTO>> getLivros() {
        return ResponseEntity.ok(livroServicePort.getLivros());
    }

}
