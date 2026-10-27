package prjNumeroAoQuadrado;

import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Informe o " + (i+1) + "° valor de A");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			b[i] = a[i] * a[i];
			System.out.println((i+1) + "° valor de B: " + b[i]);
		}
		
		sc.close();
	}

}
