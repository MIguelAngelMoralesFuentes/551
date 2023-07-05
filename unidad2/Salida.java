/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ioexception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Salida {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Intenta abrir un archivo
            reader = new BufferedReader(new FileReader("archivo.txt"));

            // Lee el contenido del archivo línea por línea
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // Captura la excepción IOException
            System.out.println("Error de entrada/salida: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                // Cierra el BufferedReader en el bloque finally
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}