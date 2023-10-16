package ejercicio3;

import java.util.Random;

public class GenerarRand {
	
	public static int generarNumero() {
		System.out.println("Generando numero aleatorio...");
		Random rand = new Random();
		return rand.nextInt(1000);
	}

}
