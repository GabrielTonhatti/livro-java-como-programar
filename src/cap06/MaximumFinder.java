package cap06;

import java.util.Scanner;

public class MaximumFinder {

	// obtém os três valores de ponto flutuante e localiza o valor máximo
	public static void main(String[] args) {

		// Cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// Solicita e insere três valores de ponto flutuante
		System.out.print("Enter three floating-point separated by spaces: ");
		double number1 = input.nextDouble(); // lê o primeiro double
		double number2 = input.nextDouble(); // lê o segundo double
		double number3 = input.nextDouble(); // lê o terceiro double

		// Determina o valor máximo
		double result = maximum(number1, number2, number3);

		// Exibe o valor máximo
		System.out.println("Maximum is: " + result);
	}

	// Retorna o máximo dos seus três parâmetros de double
	public static double maximum(double x, double y, double z) {
		double maximumValue = x; // Supõe qye X é o maior valor inicial

		// Determina se Y é maior do que maximumValue
		if (y > maximumValue) maximumValue = y;

		// Determina se Z é maior do que maximumValue
		if (z > maximumValue) maximumValue = z;
		
		return maximumValue;
	}

}
