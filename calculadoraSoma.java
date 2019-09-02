public class CalculadoraSoma {
	
	public void soma(int valorA, int valorB) {
		int soma = valorA + valorB;
		System.out.println("Soma: " + soma);
	}

}


import java.util.Scanner;

public class Pincipal {

	public static void main(String[] args) {
		CalculadoraSoma calc = new CalculadoraSoma();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor A");
		int valorA = leitor.nextInt();
		
		System.out.println("Informe o valor B");
		int valorB = leitor.nextInt();
		calc.soma(valorA, valorB);
		
		leitor.close();

	}

}
