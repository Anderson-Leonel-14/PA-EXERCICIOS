package prjSalario;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double salario, irpf;
		
		System.out.println("Entre com o salário para saber o desconto do IRPF");
		salario = leia.nextDouble();
		
		if (salario <= 1434.59 ) {
			System.out.println("Não há desconto do IRPF");
		} else if (salario >= 1434.60 && salario <= 2150.00) {
			irpf = ((salario/100*7.5) - 107.59);
			System.out.println("O desconto do IRPF de acordo com o salário é:" + irpf);
		} else if (salario >= 2150.01 && salario <= 2866.70) {
			irpf = ((salario/100*15) - 268.84);
			System.out.println("O desconto do IRPF de acordo com o salário é:" + irpf);
		} else if (salario >= 2866.71 && salario <= 3582.70) {
			irpf = ((salario/100*22.5) - 483.84);
			System.out.println("O desconto do IRPF de acordo com o salário é:" + irpf);
		} else {
			irpf = ((salario/100*27.5) - 662.94);
			System.out.println("O desconto do IRPF de acordo com o salário é:" + irpf);
		}
		
		leia.close();

	}

}
