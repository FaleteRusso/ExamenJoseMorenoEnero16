package com.corenetworks.presentacion;

import java.io.File;

public class Ej1 {
    public static void main(String[] args) {
        File f1 = new File("archivo_examen.txt");
        System.out.println("nombre del archivo-> "+ f1.getName());
        System.out.println("Ruta absoluta"+f1.getAbsolutePath());
        System.out.println("Es uns carpeta?" + f1.isDirectory());
        System.out.println("es un fichero?"+ f1.isFile());
        System.out.println("ultima modificacion?" + f1.lastModified());
        System.out.println("Existe?"+f1.exists());
    }
}
