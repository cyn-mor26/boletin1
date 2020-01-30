package Boletin1;

import java.util.Scanner;

public class Ej009 {
private static Scanner sc;
    
	public static void main(String[] args) {
	sc=new Scanner(System.in);
	
// pedir 2 numeros y ordenarlos de mayor a menor
	int num1=0, num2=0;
	
	System.out.print("Ingresar numero 1 :");
    num1=sc.nextInt();
    
	System.out.print("Ingresar numero 2 :");
	num2=sc.nextInt();
	
	if(num1>num2) {
		System.out.println("numero mayor "+num1+", numero menor "+num2 );
	}
	if (num1<num2) {
			System.out.println("numero mayor "+num2+", numero menor "+num1);
	}else {
		    System.out.println("son iguales");
	}
}
}

