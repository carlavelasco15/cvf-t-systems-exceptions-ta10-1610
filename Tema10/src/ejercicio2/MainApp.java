package ejercicio2;

public class MainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Soy tu mensaje");	
			throw new CustomException(111);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}

}
