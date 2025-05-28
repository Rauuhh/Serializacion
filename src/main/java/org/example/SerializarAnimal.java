package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializarAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Perro", 5));
        animales.add(new Animal("Gato", 3));
        animales.add(new Animal("Loro", 2));
        try{ ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("src/main/resources/animal.ser"));
            salida.writeObject(animales);
            System.out.println("Lista de animales serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
