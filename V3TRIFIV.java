/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class V3TRIFIV {
    public static void main (String[]args) throws IOException
    {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        System.out.println("Dame el numero:");
        numero= Integer.parseInt(bufEntrada.readLine());
        
       
       retornoMultiplo(numero);
       
    }
        public static String retornoMultiplo(int num)
        {
        int mult3,mult5;
        mult3= num%3;
        mult5=num%5;
        
       if(mult5==0 && mult3 ==0)
       {
           System.out.println("TRIFIVE");
           
       }
       else if(mult5==0)
       {
           System.out.println("FIVE");
       }
       else if(mult3 ==0)
       {
           System.out.println("TRI");
       }
        return "no es numero de 3 y 5";
        
    
    
}
}
