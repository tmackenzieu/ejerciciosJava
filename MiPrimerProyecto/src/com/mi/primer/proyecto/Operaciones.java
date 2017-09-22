package com.mi.primer.proyecto;

public class Operaciones {

	protected int sumar(int numero1,int numero2) {
		int resultadoSuma = numero1 + numero2;
		return resultadoSuma;
	}
	
	protected int restar(int numero1, int numero2) {
		int resultadoResta = numero1 - numero2;
		return resultadoResta;
	}
	
	protected int multiplicar(int numero1, int numero2) {
		int resultadoMultiplicacion = numero1 * numero2;
		return resultadoMultiplicacion;
	}
	
	protected int dividir(int numero1, int numero2) {
		int resultadoDivision = numero1 / numero2;
		return resultadoDivision;
	}
}
