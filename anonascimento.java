public class Nascimento {
	public void idade(int anonascimento, int anoatual) {
		int idade = anoatual - anonascimento;
		System.out.println("Idade: " + idade);
	}


}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Nascimento nasc = new Nascimento();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu ano de nascimento?");
		int anonascimento = leitor.nextInt();
		
		System.out.println("Qual o ano em que estamos?");
		int anoatual = leitor.nextInt();
		nasc.idade(anonascimento, anoatual);
		
		
		leitor.close();

	}

}

