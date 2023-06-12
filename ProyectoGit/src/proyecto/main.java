package proyecto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado, resultado2;
		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();
		
		resultado = suma(numero1,numero2);
		resultado2 = resta(numero1,numero2);
		
		System.out.println("El resultado es: " + resultado);
		System.out.println("El resultado es: " + resultado2);
		
	}
	
	public static int suma(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
	

}
