package cap02;

import java.util.Scanner;   // Programa utiliza a classe Scanner

public class Addition {

    // Método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1;    // Primeiro número a somar
        int number2;    // Segundo número a somar
        int sum;    // Soma de number1 e number2

        System.out.println("Enter first integer: "); //prompt
        number1 = input.nextInt();  // Lê o primeiro número fornecido pelo usuário

        System.out.println("Enter second integer: "); //prompt
        number2 = input.nextInt();  // Lê o primeiro número fornecido pelo usuário

        sum = number1 + number2;    // Soma os números, depois armazena o total em sum

        System.out.printf("Sum is %d%n", sum);  // Exibe a soma
    }   // Fim do método main
}   // Fim da classe Addition
