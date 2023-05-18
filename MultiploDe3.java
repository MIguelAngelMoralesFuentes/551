/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multiplode3;

import java.util.*;
public class MultiploDe3 {
     public static void main(String[]args)
    {
        int a,b,c;
        Scanner leer= new Scanner (System.in);
        System.out.println("Inserta un numero");
        a=leer.nextInt();
        c=a%3;
        b=a%5;
       
        if(c == 0 & b==0)
        {
            System.out.println("TRIFive");
           
        }
        else 
        {
            if(c==0)
            {
                System.out.println("Tree");
            }
            else
            {
                if(b==0)
                {
                    System.out.println("Five");
                }
            }
        }
    }
}
