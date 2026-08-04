package prjGastoCombustivel;

import java.util.Scanner;

public class CalculoCombustivel {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int km, cap, m;
		
		System.out.println("Insira a distância percorrida");
		km = leia.nextInt();
		
		System.out.println("Insira a capacidade do tanque de combustível");
		cap = leia.nextInt();
		m = km/cap;
		
		if (m>=10) {
			System.out.println("Econômico");
		} else {
			System.out.println("Não econômico");
		}
		
		leia.close();
	}

}
