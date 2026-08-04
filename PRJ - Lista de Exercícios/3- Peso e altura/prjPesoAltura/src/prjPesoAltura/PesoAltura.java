package prjPesoAltura;

import java.util.Scanner;

public class PesoAltura {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double peso, altura, imc;
		
		System.out.println("Insira o peso do usuário");
		peso = leia.nextDouble();
		
		System.out.println("Insira a altura do usuário");
		altura = leia.nextDouble();
		imc = peso/(altura*altura);
		
		if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
		} else if (imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc < 30) {
			System.out.println("Excesso de Peso");
		} else if (imc < 35) {
			System.out.println("Obesidade (Grau I)");
		} else if (imc < 40) {
			System.out.println("Obesidade (Grau II)");
		} else {
			System.out.println("Obesidade (Grau III)");
		}
		
		leia.close();

	}

}
