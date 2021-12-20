package cap05;

public class Intereste {

	public static void main(String[] args) {
		
		double amount;	// Quantia em depósito ao fim de cada ano;
		double principal = 1000.0;	// Quantia inicial antes do juros
		double rate = 0.05;	// Taxa de juros
		
		// Exibe cabeçalhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		// Calcula a quantidade de depósito para cada um dos dez anos
		for(int year = 1; year <= 10; ++year) {
			
			// Calcula nova quantidade durante ano especificado
			amount = principal * Math.pow(1.0 + rate, year);
			
			// Exibe o ano e a quantidade
			System.out.printf("%4d%, 20.2f%n", year, amount);
		}
		
	}
}
