package Boletin1;

import java.util.Scanner;

public class Ej008 {

	// Pedir dos numeros y decir cual es el mayor o si son iguales.

private static Scanner gr;

//dos numeros y decir cuales el mayor
	
	public static void main(String[]args){
		
		gr = new Scanner (System.in);
		
		int num1, num2;
		System.out.println("Ingrese numero 1 :");
		num1= gr.nextInt();
		
		System.out.println("Ingrese numero 2 :");
		num2= gr.nextInt();
		
		if (num1==num2) {
			   System.out.println("son iguales");  
			}
		else if (num1>num2 ) {
	
			System.out.println("numero 1 mayor que numero 2");
		 }
		   else{
		  
		    System.out.println("numero 2 mayor que numero 1");
		   } 
	
}
}