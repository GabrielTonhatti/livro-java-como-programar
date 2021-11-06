package cap04;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {

		// Cria um Scanner para obter entrada a partir de uma janela de comando
		Scanner input = new Scanner(System.in);

		// Inicializando variáveis nas declarações
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// Processa 10 alunos utlizando o loop controlado por contador
		while (studentCounter <= 10) {

			// Scolicita ao usuário uma entrada e obtém valor fornecido pelo usuário
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();

			// if...else estpa aninhado na instução while
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;
			
			// Incrementa studentCounter até o loop terminar
			studentCounter = studentCounter + 1;
		}
		
		// Fase de término: prepara e exibe os resultados
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		// Determina se mais de 8 alunos foram aprovados
		if (passes > 8)
			System.out.println("Bonus to instructor");
	}

}
