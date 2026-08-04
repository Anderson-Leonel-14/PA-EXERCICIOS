package prjTiposDeTriangulos;

import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Entre com o primeiro número");
		a = leia.nextDouble();
		
		System.out.println("Entre com o segundo número");
		b = leia.nextDouble();
		
		System.out.println("Entre com o terceiro número");
		c = leia.nextDouble();
		
		if ((a > b+c) || (b > a+c) || (c > a+b)) {
			System.out.println("Não é um triângulo");
		} else if ((a == b) && (b==c)) {
			System.out.println("Triângulo Equilátero");
		} else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("triângulo Escaleno");
		}
		
		leia.close();

	}

}
