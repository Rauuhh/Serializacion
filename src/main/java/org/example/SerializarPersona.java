package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarPersona {
    public static void main(String[] args) throws FileNotFoundException {
        Persona p = new Persona("Carlos",30);

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/persona.ser"));
            out.writeObject(p);
            out.close();

        }catch (IOException e){
            System.out.println("lgo ha slaido mal");
            e.printStackTrace();
        }
        System.out.println("Objeto serializado en persona.ser");
    }
}
