package ejercicio5;

public class MainApp {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);	
		System.out.print("Ingrese la longitud de las contraseñas: ");
		int longitud = scanner.nextInt();
		
		System.out.print("Ingrese la cantidad de contraseñas: ");
		int cantidad = scanner.nextInt();
		
		Password[] contrasenas = new Password[cantidad];
		boolean[] contrasenasFuertes = new boolean[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
		    contrasenas[i] = new Password(longitud);
		    contrasenasFuertes[i] = contrasenas[i].esFuerte();
		}
		
		System.out.println("Contraseñas y si son validas:");
		for (int i = 0; i < cantidad; i++) {
			System.out.println(contrasenas[i].getContrasena() + " " + contrasenasFuertes[i]);
		}

	}

}
