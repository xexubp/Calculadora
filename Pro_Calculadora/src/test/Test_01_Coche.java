package test;

import java.util.Scanner;
import java.util.Vector;

import beans.Coche;

public class Test_01_Coche {

	public static void main(String[] args) {

		Coche audi = new Coche();
		
		audi.setCilindrada(1000);
		audi.setColor("blanco");
		audi.setMarca("audi");
		audi.setModelo("a4");
		audi.setNumPuertas(2);
		audi.setMatricula("8888");
		audi.setPais("Rusia");
		
		
		Coche seat = new Coche("Seat","Leon");
		seat.setCilindrada(1000);
		seat.setColor("blanco");
		seat.setModelo("a4");
		seat.setNumPuertas(2);
		seat.setMatricula("8888");
		seat.setPais("Rusia");
		
		
		Coche renauld = new Coche();
		

		Vector<Coche> coches = new Vector();
		coches.add(audi);
		coches.add(seat);
		coches.add(renauld);

		boolean encontrado = false; // para saber si lo ha ncontrado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de matricula");
		String matri = sc.nextLine();

		for (Coche coche : coches) {
			if (coche.getMatricula().equals(matri)) {
				System.out.println(coche);
				encontrado = true;
			}
		}
		if (!encontrado) {

			System.err.println("No existe la matricula");
		}

	}

}
