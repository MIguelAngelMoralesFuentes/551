/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

/**
 *
 * @author Lenovo
 */
public class Validacion {
    public String retornavalidacion(int num)
            {
                if(num >= 18)
                {
                    return "ERES MAYOR DE EDAD";
                }
                else if (num < 18)
                {
                    return "ERES MENOR DE EDAD";
                }
                return null;
            }
    
}
