package com.biblioteca.domain.services;

import org.springframework.stereotype.Service;

import com.biblioteca.application.input.IRegistrarLibroInput;
import com.biblioteca.application.output.IRegistrarLibroOutput;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrarLibroService implements IRegistrarLibroInput{

    private final IRegistrarLibroOutput registrarLibroOutput;

    @Override
    public void registrarLibro(String titulo) {
        registrarLibroOutput.registrarLibro(titulo);
    }
    
}
