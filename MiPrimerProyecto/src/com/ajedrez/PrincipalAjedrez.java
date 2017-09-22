package com.ajedrez;

public class PrincipalAjedrez {

	// atributos de la clase 
	// constructor 

	public static void main(String[] args) {
		PrincipalAjedrez principalAjedrez  = new PrincipalAjedrez();
		principalAjedrez.inicializarTablero();
	    
		int variable = principalAjedrez.obtenerValor(10);
		System.out.println(variable);
		
		PiezasAjedrez[] pieza = PiezasAjedrez.values();
		
		System.out.println(pieza);
	
	}
	
// get and setters 
// metodos
	
	public int obtenerValor(int parametro){
		return parametro/2;
	}

	
	public void inicializarTablero() {
		   System.out.println("Tablero de ajedrez:");
			int tablero[][] = new int[8][8];

			for (int fila=0; fila < tablero.length; fila++) {
				for (int col=0; col < tablero.length; col++) {
					 System.out.print (tablero[fila][col] + "|");
					 
				}
			 System.out.println("");
			}
		
	}

}

