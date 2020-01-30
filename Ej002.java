package Boletin1;

import java.util.Scanner;

public class Ej002 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		double r=0, PI= 3.141592653589;
		@SuppressWarnings("unused")
		double A=PI*Math.pow(r, 2);
		//pedir radio de un circulo y calcular su area. A= PI*r^2
		System.out.println("Ingrese radio del circulo");
		r=sc.nextInt();
		System.out.println("Area es : "+(PI*Math.pow(r, 2)));
		}
	}


