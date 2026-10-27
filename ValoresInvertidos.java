package prjValoresInvertidos;

import java.util.Scanner;

public class ValoresInvertidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, i2;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "° valor de A");
			a[i] = sc.nextInt();
		}
		i=0;
		for(i2=9; i2 >= 0; i2--) {
			b[i] = a[i2];
			System.out.println((i+1) + "° valor de B: " + b[i]);
			i++;
		}
		
		sc.close();
	}

}
