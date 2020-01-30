package Boletin1;

import java.util.Scanner;

public class Ej003 {
	private static Scanner sc;
	public static void main(String[] args) {
		// pedir el radio de una circunferencia y calcular su longitud.L= 2*PI*r
		
		sc= new Scanner(System.in);
	int r=0;
	double PI= 3.141592653589;
	@SuppressWarnings("unused")
	double L = (2*PI*r);
	System.out.println("Ingresar radio de circunferencia");
	r= sc.nextInt();
	System.out.println("Longitud es:"+(2*PI*r));
	}
}

