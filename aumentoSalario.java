import java.util.Scanner;
public class Cadastro {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		double salario, novosalario;
		
		System.out.println("Informe seu nome: ");
		nome = leitor.next();
		
		if(nome == "fim") {
			System.out.println("O programa está sendo encerrado...");
		}
		else {
		System.out.println("Qual o valor do seu salario? ");
		salario = leitor.nextDouble();
		
		novosalario = salario * 1.2;
		
		while(salario <=500) {
			salario = novosalario;
			System.out.println(nome + ", você tem direito ao benefício! Seu novo salário é: " +novosalario +"R$");
		}
		else {
			System.out.println(nome + ", você não tem direito ao benefício...");
		}
	}

} 
}
