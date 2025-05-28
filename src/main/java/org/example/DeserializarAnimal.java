package org.example;

import java.io.*;
import java.util.ArrayList;

public class DeserializarAnimal {
    public static void main(String[] args) {
        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream("src/main/resources/animal2.ser"));
            ArrayList<Animal> animales = (ArrayList<Animal>) entrada.readObject();

            System.out.println("Animales deserializados:");
            for (Animal a : animales) {
                System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Creando archivo con datos por defecto...");
            crearArchivoPorDefecto();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo. Puede estar dañado.");
            crearArchivoPorDefecto();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        }
    }

    public static void crearArchivoPorDefecto() {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Perro", 5));
        animales.add(new Animal("Gato", 3));

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
            new FileOutputStream("src/main/resources/animal2.ser"));
            salida.writeObject(animales);
            salida.close();
            System.out.println("Archivo creado con datos por defecto.");
        } catch (IOException e) {
            System.out.println("No se pudo crear el archivo con datos por defecto.");
            e.printStackTrace();
        }

    }
}




