package org.example;

import java.io.*;

public class DeserializarPersona {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/persona.ser"));
            Persona p = (Persona) in.readObject();
            System.out.println("Objeto persona leido: " + p);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
