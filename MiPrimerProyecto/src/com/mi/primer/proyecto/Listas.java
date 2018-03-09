package com.mi.primer.proyecto;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
    public static void main(String args[]) {
    	List<String> listStrings = new ArrayList<>();
    	listStrings.add("Papa");
    	listStrings.add("arroz");
    	listStrings.add("tallarines");
    	listStrings.add("tomate");
    	System.out.println(":::: MetodoClasico::::");
        mostrarElementosClasico(listStrings);
    	System.out.println("");
        System.out.println("::: Método con foreach");
        mostrarElementosForeach(listStrings);
        System.out.println("::: la lista esta Vacia?");

        System.out.println(listStrings.size());
        listaEstaVacia(listStrings);
    }
    
	/**
	 *
    * @param listStrings
	 * @return 
    */
   private static String listaEstaVacia(List<String> listStrings) {
		String Resultado = "";
	   if(listStrings.isEmpty()) {
				 Resultado = "Lista Vacía";
			}else{
				 Resultado = "Lista No Vacía";
			}
	     return Resultado;
   }

    
    /**
     * Aquí vamos a iterar la lista usando el for como foreach donde vamos a
     * declarar un objeto dentro del for y lo expondrémos hacia a lista para
     * que vaya sacando los objetos de ésta.
     *
     * @param listStrings
     */
    private static void mostrarElementosForeach(List<String> listStrings) {
        for (String str : listStrings) {
            System.out.println(str.toString());
        }
    }

    /**
     * Aquí vamos a iterar la lista con el método clásico usando un índice
     * para ir iterando elemento por elemento, en este caso usando un String
     * ocupamos (aunque no es necesario) un método llamado toString() para que
     * nos muestre su representación de String, sin embargo esto es redundante
     * y lo usaremos sólo para efectos ilustrativos
     *
     * @param listStrings
     */
    private static void mostrarElementosClasico(List<String> listStrings) {
        for (int i = 0; i < listStrings.size(); i++) {
            System.out.println(listStrings.get(i).toString());
        }
    }
			
}
