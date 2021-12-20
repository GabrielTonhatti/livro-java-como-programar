package cap05;

public class WhileCounter {

	public static void main(String[] args) {

		int counter = 1; // Declara e inicializa a variável de controle

		while (counter <= 10) { // Condição de continuação do loop
			System.out.printf("%d ", counter);
			++counter; // Variável de controle de incremento
		}
		System.out.println();
	}

}
