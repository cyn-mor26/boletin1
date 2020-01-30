package Boletin1;

import java.util.Scanner;

public class Ej006 {
//pedir dos  numeros y decir si uno es multiplo del otro
	private static Scanner dato;
	
	 public static void main(String[]args) {

		   dato= new Scanner(System.in);
		   int num1,num2;
		   
		   System.out.println("ingresar numero 1");
		   num1= dato.nextInt();
		   System.out.println("ingresar numero 2");
		   num2= dato.nextInt();
		   
		   if (num1 % num2==0 ) {

			   System.out.println("El numero 1 es multiplo del numero 2");
		   }
		   else {
		  
		    System.out.println("no es multiplo");
		    } 
		
	 }    
}   	
