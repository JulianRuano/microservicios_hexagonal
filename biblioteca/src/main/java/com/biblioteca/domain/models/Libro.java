package com.biblioteca.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int id;
    private String titulo;
    private boolean estaDisponible;

    public void prestar() {
        if (estaDisponible) {
            estaDisponible = false;
        }
    }

    public void devolver() {
        if (!estaDisponible) {
            estaDisponible = true;
        }
    }
}
