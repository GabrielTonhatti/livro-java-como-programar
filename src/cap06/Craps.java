package cap06;

import java.security.SecureRandom;

public class Craps {

	// Cria um gerador seguro de números aleatórios para uso no método rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogo
	private enum Status {
		CONTINUE, WON, LOST
	};

	// Constantes que representam lançamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	// Joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0; // Ponto se não ganhar ou perder na 1º rolagem
		Status gameStatus; // pode contem CONTINUE, WON ou LOST

		int sumOfDice = rollDice(); // primeira rolagem dos dados

		// determina o estado do jogo e a pontuação com base no primeiro lançamento
		switch (sumOfDice) {
			case SEVEN: // Ganha com 7 no primeiro lançamento
			case YO_LEVEN: // Ganha com 11 no primeiro lançamento
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: // Perde com 2 no primeiro lançamento
			case TREY: // Perde com 3 no primeiro lançamento
			case BOX_CARS: // Perde com 12 no primeiro lançamento
				gameStatus = Status.LOST;
				break;
			default: // Não ganhou nem perdeu, portanto registra a pontuação
				gameStatus = Status.CONTINUE; // Jogo não terminou
				myPoint = sumOfDice; // Informa a pontuação
				System.out.printf("Point is %d%n", myPoint);
				break;
		}

		// Enquanto o jogo não estiver completo
		while (gameStatus == Status.CONTINUE) { // nem WON nem LOST

			sumOfDice = rollDice(); // Lança os dados novamente

			// Determina o estado do jogo
			if (sumOfDice == myPoint) gameStatus = Status.WON; // Vitória por pontuação
			else if (sumOfDice == SEVEN) gameStatus = Status.LOST; // Perde obtendo 7 antes de atingir a pontuação

		}

		// Exibe a mensagem ganhou ou perdeu
		if (gameStatus == Status.WON) System.out.println("Player wins");
		else System.out.println("Player loses");

	}

	// Lança os dados, calcula a soma e exibe os resultados
	public static int rollDice() {
		// Seleciona valores aleatórios do dado
		int die1 = 1 + randomNumbers.nextInt(6); // Primeiro lançamento do dado
		int die2 = 1 + randomNumbers.nextInt(6); // Segundo lançamento do dado

		int sum = die1 + die2; // Soma os valores dos dados

		// Exibe os resultados desse lançamento
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

}
