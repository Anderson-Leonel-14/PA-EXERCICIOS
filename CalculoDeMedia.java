package prjCalculoDeMedia;

import java.util.Scanner;

public class CalculoDeMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[], valores=0, media, i;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "° valor de A");
			a[i] = sc.nextInt();
			valores = valores + a[i];
		}
		media = valores/10;
		
		System.out.println("Média: " + media);
		
		sc.close();
	}

}
