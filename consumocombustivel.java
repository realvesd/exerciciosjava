public class ExercicioConsumo {
	
	public void consumo(int distancia, int combustivel) {
		int consumo = distancia / combustivel;
		System.out.println("Consumo: " + consumo);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ExercicioConsumo calc = new ExercicioConsumo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos km foram percorridos?");
		int distancia = leitor.nextInt();
		
		System.out.println("Quantos litros de combustivel foram consumidos?");
		int combustivel = leitor.nextInt();
		calc.consumo(distancia, combustivel);
		
		leitor.close();

	}

}
