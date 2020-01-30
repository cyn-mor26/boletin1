package Boletin1;

import java.util.Scanner;

public class Ej007 {
	
// dos numeros y decir cuales el mayor
	private static Scanner sc;
	public static void main(String[]args) {
		
		sc=new Scanner(System.in);
		int num1=0,num2=0;
		
		System.out.println("Ingrese numero 1 ");
		num1=sc.nextInt();
		System.out.println("Ingrese numero 2 ");
		num2=sc.nextInt();
		
	if(num1>num2)	{
		System.out.println(+num1+" es mayor que "+num2);
	}	
	else{
		System.out.println( +num2+" es mayor que " +num1);
		}
	}
	}