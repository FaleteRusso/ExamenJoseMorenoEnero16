package com.corenetworks.presentacion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre del archivo de origen:(origen.txt) ");
        String aO = sc.nextLine();
        System.out.print("Escribe el nombre del archivo de destino:(destino.txt) ");
        String aD = sc.nextLine();
        System.out.println("Escribe un número entre 1 y 255: ");
        int nObt= sc.nextInt();
        int numVal = nObt;
        numGen(aO, numVal);
        try (FileReader reader = new FileReader(aO);
             FileWriter writer = new FileWriter(aD)) {
            //operación XOR
            int num;
            while ((num = reader.read()) != -1) {
                // Calcular XOR con el valor numérico
                int letCif = num ^ numVal;
                // Escribir el resultado en el archivo de destino
                writer.write(letCif);
            }

            System.out.println("Cifrado completado.");

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }


   private static void numGen(String nomArchivo, int valor) {
        try (FileWriter writer = new FileWriter(nomArchivo)) {
            writer.write(String.valueOf(valor));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }


}

