package ejercicio2;

public class CustomException extends Exception{
	
	private int codigoException;
	
	public CustomException(int codigoError) {
		super();
		this.codigoException = codigoError;
	}
	
	@Override
	public String getMessage() {
		String mensaje = "";
		
		switch (codigoException) {
		case 111:
			mensaje="Esto es una excepcion personalizada 111";
			break;
		}
		return mensaje;
	}
	

}
