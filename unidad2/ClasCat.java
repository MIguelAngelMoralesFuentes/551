/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clascast;

public class ClasCat {
    public static void main(String[] args) {
        try {
            // Intenta realizar un casting inválido
            Object obj = "Hola";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            // Captura la excepción ClassCastException
            System.out.println("Casting inválido: " + e.getMessage());
            e.printStackTrace();
        }
    }
}