package cap02;

import java.util.Scanner;

public class Comparison {

    // Método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        //Cria Scanner para obter entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        int number1;    // Primeiro número a somar
        int number2;    // Segundo número a somar

        System.out.println("Enter first integer: "); //prompt
        number1 = input.nextInt();  // Lê o primeiro número fornecido pelo usuário

        System.out.println("Enter second integer: "); //prompt
        number2 = input.nextInt();  // Lê o primeiro número fornecido pelo usuário

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }

        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }

    }   // Fim do método main
}   // Fim da classe Addition