package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
	
	static Scanner sc = new Scanner(System.in);

	private static final int MIN = 1;
	private static final int MAX = 500;
	
	public static void iniciarJuego() {
		boolean adivinado = false;
		System.out.println("Bienvenido el juego de Adivinar el numero :D");
		int numeroAleatorio = generarNumeroAleatorioRangos(MIN, MAX);
		System.out.println("Chuleta numero: " + numeroAleatorio);
		while (!adivinado)
			adivinado = consultarNumero(numeroAleatorio,MIN, MAX);
		sc.close();
	}
	
	public static int generarNumeroAleatorioRangos(int min, int max) {
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(max - min + 1) + min;
		return numeroAleatorio;
	}

	public static boolean consultarNumero(int numero, int min, int max) {
		System.out.print("Adivina un numero entre " + min + " y " + max + ": ");
		
		try {
			int input = sc.nextInt();
			if (numero == input) {
				System.out.println("NUMERO CORRECTO!!! FELICIDADES, ERES UN GENIO!!!");
				return true;
			}
			if (numero > input)
				System.out.println("NUMERO INCORRECTO: El numero aleatorio es MÁS GRANDE que " +  input + ".");
			if (numero < input)
				System.out.println("NUMERO INCORRECTO: El numero aleatorio es MÁS PEQUEÑO que " +  input + ".");
		} catch (NumberFormatException  e) {
			System.out.println("Entrada no válida.");
		}
		return false;
	}
	

}
