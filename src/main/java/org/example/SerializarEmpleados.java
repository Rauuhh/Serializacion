package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializarEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Laura", 2500.0));
        lista.add(new Empleado("Carlos", 1800.0));
        lista.add(new Jefe("Marta", 3500.0, "Marketing"));
        lista.add(new Jefe("Pedro", 4000.0, "Finanzas"));

        try {
            ObjectOutputStream salida = new ObjectOutputStream (new FileOutputStream("src/main/resources/empleados.ser"));
            salida.writeObject(lista);
            System.out.println("Lista de empleados y jefes serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
