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
        System.out.println("::: M�todo con foreach");
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
				 Resultado = "Lista Vac�a";
			}else{
				 Resultado = "Lista No Vac�a";
			}
	     return Resultado;
   }

    
    /**
     * Aqu� vamos a iterar la lista usando el for como foreach donde vamos a
     * declarar un objeto dentro del for y lo expondr�mos hacia a lista para
     * que vaya sacando los objetos de �sta.
     *
     * @param listStrings
     */
    private static void mostrarElementosForeach(List<String> listStrings) {
        for (String str : listStrings) {
            System.out.println(str.toString());
        }
    }

    /**
     * Aqu� vamos a iterar la lista con el m�todo cl�sico usando un �ndice
     * para ir iterando elemento por elemento, en este caso usando un String
     * ocupamos (aunque no es necesario) un m�todo llamado toString() para que
     * nos muestre su representaci�n de String, sin embargo esto es redundante
     * y lo usaremos s�lo para efectos ilustrativos
     *
     * @param listStrings
     */
    private static void mostrarElementosClasico(List<String> listStrings) {
        for (int i = 0; i < listStrings.size(); i++) {
            System.out.println(listStrings.get(i).toString());
        }
    }
			
}
