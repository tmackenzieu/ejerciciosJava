package com.mi.primer.proyecto;

import javax.swing.JOptionPane;

public class PrincipalClase1 {
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número 1: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número 2: "));
		
		Operaciones calcular = new Operaciones();
	 	int suma = calcular.sumar(numero1, numero2);
		int resta = calcular.restar(numero1, numero2);
		int multiplicar = calcular.multiplicar(numero1, numero2);
		int division = calcular.dividir(numero1, numero2);
		String Resultado = "Resultado de la Suma :" + suma + "\n" + "Resultado de la Resta :" + resta + "\n" + "Resultado de la multiplicacion :" + multiplicar + "\n" + "Resultado de la division :" + division;
		
		JOptionPane.showMessageDialog(null, Resultado);
		
		Clase1 objeto1 = new Clase1(27,"tabyta","17.781.922-0");
		objeto1.setEdad(10);
		objeto1.setNombre("Jose");
		System.out.println("Edad: " + objeto1.getEdad());
		System.out.println("Rut: " + objeto1.getRut());
		System.out.println("Nombre :" + objeto1.getNombre());
		
		objeto1.mostrarDatos();
	}
}
