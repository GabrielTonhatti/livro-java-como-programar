package cap03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		// Cria dois objetos Account
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// Exibe o saldo inicial de cada Objeto
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		// Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtém do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		// Exibe os saldos
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtém do usuário
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		// Exibe os saldos
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		System.out.print("\nEnter an amount to be withdrawn from your account1: ");
		double withdraw = input.nextDouble();
		account1.withDraw(withdraw);

		// Exibe os saldos
		System.out.printf("%n%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%n%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		input.close();
	}

}
