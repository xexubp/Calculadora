package test;

import java.sql.SQLException;
import java.util.Vector;

import calculadora.Calculadora;
import exception.Miexcepcion;

public class Test_Calculadora {

	public static void main(String[] args) throws SQLException {
		/*Calculadora calculadora=new Calculadora();
		
		System.out.println(calculadora.Suma(2, 4));
		System.out.println(calculadora.Suma(2, 4, 8));
		
		Vector<Double>numeros=new Vector();
		numeros.addElement(8.0);
		numeros.addElement(18.0);
		numeros.addElement(118.0);
		numeros.addElement(28.0);
		System.out.println(calculadora.Suma(numeros));
		
		
		System.out.println(calculadora.Suma("jes", "us"));
		
		
		System.out.println(calculadora.factorial(4));
		
		
		System.out.println(calculadora.potencia(2, 3));*/
		
		
		
		
		
		//trabajando directamente con la clase sin necesidad de crear el objeto a diferencia de arriba
		
		
		/*System.out.println(Calculadora.Suma(4, 5));  //DA ERROR POR QUERER SUMAR EL SEGUNDO POR 5*/
		try {
			System.out.println(Calculadora.Suma(2, 5, 5)); //SI NO SE EJECUTA DE MANERA CONTROLADA LA FUNCION DARA ERROR HASTA TRATARLA
		} catch (Miexcepcion e) {
			//al tenerlo en la funcion y tratarla en el principal ya sale el mensaje de la excepcion tratada
		} 
		
		
	}
}
