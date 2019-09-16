public class Conta {
	
	double totalGasolina;
	private double contaTotal;
	
	public double gettotalGasolina() {
		return totalGasolina;
	}
	
	public void settotalGasolina(double totalGasolina) {
		this.totalGasolina = totalGasolina;
	}


	public double getContaTotal() {
		return contaTotal;
	}
	
	public void setcontaTotal(double contaTotal) {
		this.contaTotal(contaTotal);
}

		
	}
  
  import java.util.Scanner;
public class TotalGeral {
	
	public static double calculoConta(double qntLitros) {
		double refri = 3;
		double gasolina = (qntLitros * 2.50);
		
		double contaTotal = (gasolina + (refri * 2));
		
		System.out.println("Valor total da gasolina: " + gasolina);
		System.out.println("Valor total do refrigerante: "+ (refri*2));
		System.out.println("valor total a ser pago: " +contaTotal);
		
		
		
		
	return contaTotal;
		
		
	
	}
	
	public static void main(String[] args) {
		Conta continha = new Conta();
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de litros que foram abastecidos? ");
		continha.totalGasolina = leitor.nextDouble();
		
		
		

}

}
