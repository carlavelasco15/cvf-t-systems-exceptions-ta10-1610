package ejercicio3;

public class MainApp {

	public static void main(String[] args) {
		int numeroAleatorio;
		try {
			numeroAleatorio = GenerarRand.generarNumero();
			throw new ParOImparException(numeroAleatorio);
		} catch (ParOImparException e) {
			System.out.println(e.getMessage());
		}
	}
}
