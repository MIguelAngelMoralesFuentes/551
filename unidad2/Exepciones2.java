/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exepciones2;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Exepciones2 {
    public static void main(String[]args)
    {
        int x,y;
        try{
            x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:","solicitodatos",3));
            y= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2:","solicitodatos",3));
            JOptionPane.showMessageDialog(null, "La division de " + x + "/" + y + "es" + (x/y), " Mostrando resultado", 1);
        }
        catch(NumberFormatException n){
            System.out.println(n.getMessage() + "No es un numero ENTERO");
        }
        catch(ArithmeticException q){
            System.out.println(q.getMessage() + "No se puede dividir entre 0");
        }
    }
}
