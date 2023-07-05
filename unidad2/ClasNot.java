/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasnot;

public class ClasNot {
    public static void main(String[] args) {
        try {
            // Intenta cargar una clase que no existe
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            // Captura la excepción ClassNotFoundException
            System.out.println("La clase no se encontró: " + e.getMessage());
            e.printStackTrace();
        }
    }
}