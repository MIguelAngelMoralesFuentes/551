
package com.mycompany.exepciones;

import javax.swing.JOptionPane;

public class Exepciones {
    public static void main (String[]args)
    {
        /*Numberformatexception es para cuando ingresan un caracter que no es valido*/
        int x,y;
        try
        {
        x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
        }
        catch(NumberFormatException n)
        {
            System.out.println(n.getMessage() + " No es numero entero");
        }
            
    }
}

