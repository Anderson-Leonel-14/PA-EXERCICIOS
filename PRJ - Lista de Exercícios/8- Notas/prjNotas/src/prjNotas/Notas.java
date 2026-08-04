package prjNotas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double n1, n2, m, exame, mediaNova;
		
		System.out.println("Entre com a 1° nota");
		n1 = leia.nextDouble();
		System.out.println("Entre com a 2° nota");
		n2 = leia.nextDouble();
		m = (n1+n2) /2;
		System.out.println(m);
		
		if (m < 3) {
			System.out.println("Reprovado");
		} else if (m >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("O aluno está em exame. Entre com a nota do exame");
			exame = leia.nextDouble();
			mediaNova = (m+exame) /2;
			System.out.println(mediaNova);
			
			if (mediaNova >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
		
		leia.close();

	}

}
