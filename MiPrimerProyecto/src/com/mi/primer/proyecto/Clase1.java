package com.mi.primer.proyecto;

public class Clase1 {
	private int edad;
	private String nombre;
	private final String rut;
	
	//constructor
	public Clase1(int edad, String nombre, String rut) {
		this.edad = edad;
		this.nombre = nombre;
		this.rut = rut;
	}

	// getters and setters 
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRut() {
		return rut;
	}
   
	
	public void mostrarDatos() {
		System.out.println("------------ MOSTRAR DATOS -------------");
		System.out.println("Nombre:" + nombre + "\n"+ "Edad:" + edad + "\n"+ "Rut:" +  rut);
	}
}
