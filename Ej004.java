package Boletin1;
import java.util.Scanner;



public class Ej004 {

//Pedir dos números y decir si son iguales o no.
 
	@SuppressWarnings("unused")
	private static Scanner num;

	public static void main(String[] args) {
	
	int num1, num2;
	@SuppressWarnings("resource")
	Scanner num = new Scanner(System.in);
	System.out.println("Ingrese numero 1 :");
	num1= num.nextInt();
	  System.out.println("Ingrese numero 2 :");
	  num2 = num.nextInt();
	  if (num1==num2){
		  System.out.println("son iguales");
	  }
	  else{
		  System.out.println("son diferentes");
	  }
	}
}

