package cap06;

public class Scope {

	// Campo acessível para todos os métodos dessa classe
	private static int x = 1;

	// O método main cria e inicializa a variável local x
	// e chama os métodos useLocalVariables e useField
	public static void main(String[] args) {
		int x = 5; // Variável local x do método sombreia o campo x

		System.out.printf("local x in main is %d%n", x);

		useLocalVariable(); // useLocalVariable tem uma variável local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a variável local x
		useField(); // Campo x da classe Scope retém se valor

		System.out.printf("%nlocal x in main %d%n", x);
	}

	// Cria e inicializa a variável local x durante cada chamada
	public static void useLocalVariable() {
		int x = 25; // Inicializa toda vez que useLocalVariable é chamado

		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
		x++; // Modifica a variável local x desse método
		System.out.printf("local x before existing method useLocalVariable is %d%n", x);
	}

	// Modifica o campo x da classe Scope durante cada chamada
	public static void useField() {
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		x *= 10; // Modifica o campo x da classe Scope
		System.out.printf("field x before existing method useField is %d%n", x);
	}

}
