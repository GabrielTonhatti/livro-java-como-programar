package cap04;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {

		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// Fase de inicialização
		int total = 0; // Inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 0; // Inicializa nº da noa a ser inserido em seguida

		// Fase de processamento
		// solicita entrada e lê a nota do usuário
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();

		// faz um loop até o valor de sentinela inserido pelo usuário
		while (grade != -1) {

			total = total + grade; // Adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa counter

			// Solicita entrada e lê a próxima nota fornecida pelo usu
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();

		}

		// Fase de término
		// Se o usuário inseriu pelo menos uma nota...
		if (gradeCounter != 0) {
			// Usa número com ponto decimal para calcular a média das notas
			double average = (double) total / gradeCounter;

			// Exibe o total e a média das notas (com dois digitos de precisão)
			System.out.printf("%nTotal of all 10 grade is %d%n",gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} else // Nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
			System.out.println("No grades were entered");

	}

}
