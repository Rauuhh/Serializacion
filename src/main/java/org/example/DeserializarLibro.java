package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class DeserializarLibro {
    public static void main(String[] args) {
        try {
            ObjectInputStream entrada = new ObjectInputStream(
            new FileInputStream("src/main/resources/mapa.ser"));
            HashMap<String, Libro> mapa = (HashMap<String, Libro>) entrada.readObject();
            TreeMap<String, Libro> mapaOrdenado = new TreeMap<>(mapa);
            System.out.println("Contenido del mapa ordenado por clave:");
            for (Map.Entry<String, Libro> entry : mapaOrdenado.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar el mapa.");
            e.printStackTrace();
        }
    }
}
