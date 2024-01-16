package com.corenetworks.presentacion;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

    public class Ej3Servidor {
        public static void main(String[] args) {
            BufferedReader mE;
            PrintWriter mS;
            String respuesta;
            Random numRandom = new Random();     
            int random = numRandom.nextInt(4);
            String solicitud = random(numRandom);
            try (ServerSocket servidor = new ServerSocket(3001);) {
                while (true) {
                    System.out.println("Esperando pregunta del cliente....");
                    Socket s1 = servidor.accept();
                    mE = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                    respuesta = mE.readLine();
                    System.out.println(respuesta);
                    mS = new PrintWriter(s1.getOutputStream(), true);
                    mS.printf("mensaje salida");

                    private static String resultado () {


                        switch (random) {
                            case 0:
                                return "Autorizado";
                            case 1:
                                return "Error 9137";
                            case 2:
                                return "Error 9221";
                            case 3:
                                return "Error 9677";
                            default:
                                return "Error desconocido";
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }