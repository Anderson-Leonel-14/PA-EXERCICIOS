package prjCalculoIdade;

import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int aa, an, id;
		
		System.out.println("insira o ano de nascimento");
		an = leia.nextInt();
		System.out.println("Insira o ano atual");
		aa = leia.nextInt();
		id = aa-an;
		 if (id<10) {
			 System.out.println("Criança");
		 } else if (id<18) {
			 System.out.println("Adolescente");
		 } else if (id<60) {
			 System.out.println("Adulto");
		 } else {
			 System.out.println("Idoso");
		 }
		
		leia.close();

	}

}
