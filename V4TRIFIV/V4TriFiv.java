
package com.mycompany.v4trifiv;
import funcionesgenerales.ConversionesMultiplo;
import java.util.Scanner;
public class V4TriFiv {
    public static void main (String[]args)
    {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("introduce el numero: ");
        numero = entrada.nextInt();
        //constructor
        ConversionesMultiplo variablenumero = new ConversionesMultiplo();
        variablenumero.retornamultiplo(numero);
        System.out.println( variablenumero.retornamultiplo(numero));
    }
}
