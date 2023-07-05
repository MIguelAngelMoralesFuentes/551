/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exepciones4;

public class Exepciones4 {
    public static void main (String[]args)
    {
        try
        {
            int division = miMetodo(10,0);
            System.out.println(division);
        }
        catch(ArithmeticException q)
        {
            System.out.println("Exepcion aritmetica arrojada");
        }
        
    }
    
    
        
    public static int miMetodo(int a, int b) throws ArithmeticException{
            int c = a/b;
            return c;
        }
}
