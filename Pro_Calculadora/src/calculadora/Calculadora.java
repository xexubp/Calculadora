package calculadora;

import java.sql.SQLException;
import java.util.Vector;

import exception.Miexcepcion;

public class Calculadora {
	
	
	//ESTO SERIAN EJEMPLOS DE SOBRECARGA DE METODOS
	public static double Suma(double a, double b) {
		if (b==5)
			try {
				throw new Miexcepcion("NO QUIERO QUE SUMAR 5 EN EL SEGUNDO 2 OPERADOR");
			} catch (Miexcepcion e) {
				System.out.println(e);
				return 0;
			}  
			//primera alternativa en el metodo de tres parametros esta tratada de la segunda alternativa
		return a+b;
		
	}
	
	
	
	/*public static double Suma(double a, double b) throws SQLException {
		if (b==5) throw new SQLException("NO QUIERO QUE SEGUNDO OPERADOR SEA 5");  
			
		return a+b;
		
	}*/
	
	public static double Suma(double a, double b, double c) throws Miexcepcion {
		if (c==5) throw new Miexcepcion("NO QUIERO QUE SUMAR 5 EN el 3 OPERADOR"); 
		return a+b+c;
	}

	public static double Suma(Vector<Double> n) {
		double total=0;
		for (Double numero : n) {
			total+=numero;
		}
		return total;
	}
	
	public String Suma(String a, String b) {
		return a+b;
	}
	

	//CON RECURSIVIDAD
	
	public static int factorial(int n) {
		if (n==1||n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
			
		}
	}
	
	public static int  potencia(int base,int exponente) {
		if (exponente==0) {
			return 1;
		}else {
			return base* potencia(base,exponente-1);
		}
	}
	
}
