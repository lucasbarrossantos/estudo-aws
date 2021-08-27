package com.estudo.application.ports;

import com.estudo.adapters.dto.LivroDTO;

import java.util.List;

public interface LivroServicePort {

    public List<LivroDTO> getLivros();

}
