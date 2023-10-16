package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathUtils {
	
	public static double suma() {
		double a = pedirNumero();
		double b = pedirNumero();
		return a + b;
	}
	
	public static double resta() {
		double a = pedirNumero();
		double b = pedirNumero();
		return a - b;
	}
	
	public static double multiplicacion() {
		double a = pedirNumero();
		double b = pedirNumero();
		return a * b;
	}
	
	public static double potencia() {
		double a = pedirNumero();
		return a * a;
	}
	
	public static double raizCubica() {
		double a = pedirNumero();
		return Math.cbrt(a);
	}
	
	public static double division() {
		double a = pedirNumero();
		double b = pedirNumero();
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
		return a / b;
	}
	
	public static double pedirNumero() {
		Scanner scanner = new Scanner(System.in);
		   try {
	        System.out.print("Escribe el número: "); 
	        return scanner.nextDouble(); 
		} catch (InputMismatchException e) {
	        throw new InputMismatchException("Entrada inválida. Ingrese un número válido.");
	    }
	}
	
	
	
	
	

}
