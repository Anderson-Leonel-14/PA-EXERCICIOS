package prjOrdemCrescente;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Insira um número inteiro");
		a = leia.nextInt();
		
		System.out.println("Insira um número inteiro");
		b = leia.nextInt();
		
		System.out.println("Insira um número inteiro");
		c = leia.nextInt();
		
		if (c > a && a > b) {
			System.out.println(b + " " + a + " " +c);
		} else if (b > a && a > c) {
			System.out.println(c+ " "+ a + " " +b);
		} else if (a > b && b > c) {
			System.out.println(c+ " " + b + " " +a);
		} else if (c > b && b > a) {
			System.out.println(a+ " " + b + " " +c);
		} else if (a > c && c > b) {
			System.out.println(b+ " " + c + " " +a);
		} else {
			System.out.println(a+c+b);
		}
			
		leia.close();

	}

}
