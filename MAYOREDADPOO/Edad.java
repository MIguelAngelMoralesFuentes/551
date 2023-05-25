/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edad;
import java.util.Scanner;
import utileria.Validacion;

public class Edad {
    public static void main (String[]args)
    {
        Scanner leer = new Scanner (System.in);
        byte num;
        System.out.println("Ingresa tu edad");
        num = leer.nextByte();
        Validacion listo= new Validacion();
        listo.retornavalidacion(num);
        System.out.println(listo.retornavalidacion(num));
    }
}
