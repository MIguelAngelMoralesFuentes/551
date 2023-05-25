/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesgenerales;


public class ConversionesMultiplo {
    public String retornamultiplo (int numero)
    {
        if(numero%3 == 0 && numero%5 ==0)
        {
            return "TRIFIV";
        }
        else if(numero%3 == 0)
        {
            return "TRI";
        }
        else if (numero%5 == 0)
        {
            return "FIV";
        }
        return "NINGUNO";
        
        
    }
}
