package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializarLibro {
    public static void main(String[] args) {
        HashMap<String, Libro> mapa = new HashMap<>();

        mapa.put("libro1", new Libro("A", "B"));
        mapa.put("libro2", new Libro("C", "D"));
        mapa.put("libro3", new Libro("E", "F"));

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
            new FileOutputStream("src/main/resources/mapa.ser")) ;
            salida.writeObject(mapa);
            System.out.println("HashMap de libros serializado.");
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}