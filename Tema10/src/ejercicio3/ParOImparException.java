package ejercicio3;

public class ParOImparException extends Exception {
	private int codigoException;
	
	public ParOImparException(int codigoError) {
		super();
		this.codigoException = codigoError;
	}
	
	@Override
	public String getMessage() {
		String mensaje = "";
		if (this.codigoException % 2 == 0)
			mensaje = "El numero " + this.codigoException + " es par.";
		if (this.codigoException % 2 == 1)
			mensaje = "El numero " + this.codigoException + " es impar.";
		return mensaje;
	}

}
