package cap03;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Invoice invoice = new Invoice("23", "Headset", 2, 299.99);

		System.out.printf("Número: %s, Descrição: %s, quantidade: %d, preço: %.2f, total: %.2f", invoice.getNumero(),
				invoice.getDescricao(), invoice.getQtdeComprada(), invoice.getPreco(), invoice.getInvoiceAmount());

		System.out.print("\nDigite o número da Nota Fiscal: ");
		String num = input.nextLine();
		invoice.setNumero(num);

		System.out.print("\nDigite a descrição do produto: ");
		String desc = input.nextLine();
		invoice.setDescricao(desc);

		System.out.print("\nDigite a quantidade do produto: ");
		int qtde = input.nextInt();
		invoice.setQtdeComprada(qtde);

		System.out.print("\nDigite o preço do produto: ");
		double preco = input.nextDouble();
		invoice.setPreco(preco);

		System.out.printf("Número: %s, Descrição: %s, quantidade: %d, preço: %.2f, total: %.2f", invoice.getNumero(),
				invoice.getDescricao(), invoice.getQtdeComprada(), invoice.getPreco(), invoice.getInvoiceAmount());

		input.close();
	}

}
