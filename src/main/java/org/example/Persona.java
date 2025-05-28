package org.example;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private transient int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " tiene " + edad + " años";
    }
}
