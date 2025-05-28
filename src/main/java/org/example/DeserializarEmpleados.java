package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarEmpleados {
    public static void main(String[] args) {
        try {
            ObjectInputStream entrada = new ObjectInputStream(
           new FileInputStream("src/main/resources/empleados.ser"));
            ArrayList<Empleado> lista = (ArrayList<Empleado>) entrada.readObject();
            System.out.println("Contenido deserializado:");
            for (Empleado e : lista) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar.");
            e.printStackTrace();
        }
    }
}
