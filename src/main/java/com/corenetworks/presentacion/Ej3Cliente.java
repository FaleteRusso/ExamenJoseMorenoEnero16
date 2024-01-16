package com.corenetworks.presentacion;


import java.io.*;
import java.net.Socket;

    public class Ej3Cliente {
        public static void main(String[] args) {
            String transacion= "20240115123456789012345620270624167500 %n";
            try (Socket cl = new Socket("localhost", 3001);) {
                PrintWriter sSalida = new PrintWriter(cl.getOutputStream(), true);
                sSalida.printf(transacion+"%n");
                try (BufferedReader bf = new BufferedReader(new InputStreamReader(cl.getInputStream()));) {
                    System.out.println(bf.readLine());
                }


            } catch (IOException e) {
                System.out.println(e.toString());
            }

        }
    }

