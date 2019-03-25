package beans;

public class Coche {
	
	private String marca;
	private String modelo;
	private String matricula;
	private String color;
	private int numPuertas;
	private double cilindrada;
	private static String pais;
	
	
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public Coche(String marca, String modelo, String matricula, String color, int numPuertas, double cilindrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.numPuertas = numPuertas;
		this.cilindrada = cilindrada;
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public double getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}


	public double consumo() {
		return cilindrada*0.100;
	}


	public static String getPais() {
		return pais;
	}
	public static void setPais(String pais) {
		Coche.pais = pais;
	}
	public Coche() {
		
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", color=" + color
				+ ", numPuertas=" + numPuertas + ", cilindrada=" + cilindrada + ", consumo()=" + consumo() + "pais="+pais+"]";
	}
	
	
	

}
