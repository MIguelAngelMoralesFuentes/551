/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V2TRIFIV {
    public static void main (String[]args) throws IOException
    {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero,mult3,mult5;
        System.out.println("Dame el numero:");
        numero= Integer.parseInt(bufEntrada.readLine());
        
        mult3= numero%3;
        mult5=numero%5;
        
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
                
        
    }
}
