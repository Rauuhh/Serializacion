package org.example;

import java.io.Serializable;

public class Animal implements Serializable {
    private String especie;
    private transient int edad;

    public Animal(String especie, int edad) {
        this.especie = especie;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Especie: " + especie + " Edad: " + edad;
    }
}
