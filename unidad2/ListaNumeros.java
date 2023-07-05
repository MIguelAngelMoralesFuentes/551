/*Java empieza a ejecutar el programa y reserva memoria para 
un objeto ListaDeNumeros. Como el constructor de esa clase está 
vacío, la variable tiene como referencia null. Al tratar de hacer
un recorrido con un for extendido salta el error que indica que no se 
puede aplicar ese proceso sobre una variable que referencia a null.
Modifica el constructor introduciendo este código: public ListaNumeros ()
{ listaDeNumeros = new ArrayList<Integer> (); }*/

package com.mycompany.nullpoint;

import java.util.ArrayList;

public class ListaNumeros {

    private ArrayList<Integer> listaDeNumeros;

 

    public ListaNumeros () { } // El constructor está vacío

 

    public Integer sumatorio () {
try{
     Integer suma = 0;

        for (Integer numero : listaDeNumeros) { suma = suma + numero; }

        return suma;
}catch(NullPointerException e)
    {
        System.out.println("error detectado");

    }
        return null;
    } //Cierre del método sumatorio

 

    public void añadirItem (Integer item) {

          listaDeNumeros.add (item);

    } //Cierre del método

} //Cierre de la clase