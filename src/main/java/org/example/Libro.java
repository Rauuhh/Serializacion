package org.example;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "'}";
    }
}
