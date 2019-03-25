package exception;

public class Miexcepcion extends Exception {
	
	String mensaje=" ";

	public Miexcepcion(String mensajeString) {
		super();
		this.mensaje = mensajeString;
	}

	@Override
	public String toString() {
		return "Miexcepcion [mensajeString=" + mensaje + "]";
	}
	
	

}
