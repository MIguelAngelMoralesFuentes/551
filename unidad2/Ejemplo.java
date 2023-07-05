/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filenot;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        try {
            // Intenta abrir un archivo que no existe
            File archivo = new File("archivo.txt");
            Scanner scanner = new Scanner(archivo);

            // Lee el contenido del archivo línea por línea
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            // Cierra el scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Captura la excepción FileNotFoundException
            System.out.println("El archivo no se encontró: " + e.getMessage());
            e.printStackTrace();
        }
    }
}