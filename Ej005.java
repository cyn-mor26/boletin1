package Boletin1;
// pedir un numero e indicar positivo o negativo

import java.util.Scanner;

public class Ej005 {

   private static Scanner dato;
   
   public static void main(String[]args) {

	   dato= new Scanner(System.in);
	   int num;
	   System.out.println("Ingresar numero");
	   num= dato.nextInt();
	   
	   if (num>0) {
			System.out.println("es positivo");
		} 
	   else {
			System.out.println("es negativo");
	   }
   }
}

