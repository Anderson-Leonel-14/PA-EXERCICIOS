package prjEquacao2Grau;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, delta, raiz1, raiz2;
		
		System.out.println("Entre com o valor de A");
		a = leia.nextDouble();

		System.out.println("Entre com o valor de B");
		b = leia.nextDouble();

		System.out.println("Entre com o valor de C");
		c = leia.nextDouble();
		
		delta = (b*b) -4*a*c;
		
		if (delta < 0) {
			System.out.println("Não existem raízes reais para a equação");
		} else if (delta == 0) {
			raiz1 = -b / (2*a);
			System.out.println("Existe apenas uma raiz real para a equação:" + raiz1);
		} else if (delta > 0) {
			raiz1 = (-b + Math.sqrt(delta)) / (2*a);
			raiz2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("Existem duas raizes reai para a equação:" + raiz1 + "e" + raiz2);
		}
		leia.close();
	}

}
