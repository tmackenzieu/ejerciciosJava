package com.mi.primer.proyecto;
import java.util.Scanner;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class HolaMundo {

	private static Scanner inputName;
	private static Scanner lastName;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path dir = Paths.get("c:/ejemplos/ejemplo.txt");
		System.out.println(dir.toString());
		System.out.println(dir.getFileName());
		System.out.println(dir.getNameCount());
		System.out.println(dir.getName(dir.getNameCount()-1));
	
		//Path realPath = dir.toRealPath(LinkOption.NOFOLLOW_LINKS);
		//System.out.println(realPath);
		
         FileInputStream fis;
         InputStreamReader isr;
         BufferedReader br;
         try {
        	 fis = new FileInputStream("c:/ejemplos/ejemplo.txt");
        	 isr = new InputStreamReader(fis);
        	 br = new BufferedReader(isr);
        	 
        	 String dataline = br.readLine();
        	 while(dataline != null) {
        		 System.out.println(dataline);
        		 dataline = br.readLine();
        	 }
        	 br.close();
        	 
         }catch(FileNotFoundException e){
        	 System.out.println(e.getMessage()); 
         }catch(IOException f) {
        	 System.out.println(f.getMessage());
         }

		if (Files.notExists(dir)) {
			try {
				Files.createFile(dir);
				System.out.println("Directorio creado: " + dir);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		System.out.println("Ingresa tu nombre :");
		inputName = new Scanner (System.in);
		System.out.println("Ingresa tu apellido :");
		lastName = new Scanner (System.in);
		System.out.println("El nombre ingresado fue: \"" + inputName.nextLine() + " "+ lastName.nextLine() +"\"");
		
	}
	
}