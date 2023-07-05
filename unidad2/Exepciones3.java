/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exepciones3;

public class Exepciones3 {
    public static void main(String[]args)
    {
        try
        {
            float equis = 5/0;
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException a)
        {
            System.out.println("Error: división entre 0");
        }
        finally
                {
                    System.out.println("A pesar de todo se ejecuta el bloque finally.");
                }
    }
}
