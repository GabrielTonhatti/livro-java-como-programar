package cap04;

public class Increment {
	
	public static void main(String[] args) {
		
		//Demosntra o operador de pós-incremento
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c);	// Imprime 5
		System.out.printf("postincrementing c: %d%n", c++);	// Imprime 5
		System.out.printf("c after postincrement: %d%n", c);	// Imprime 6
		
		System.out.println(); // Pula uma linha
		
		// Demonstra o operador de pré-incremento
		c = 5;
		System.out.printf("c before postincrement: %d%n", c);	// Imprime 5
		System.out.printf("postincrementing c: %d%n", ++c);	// Imprime 6
		System.out.printf("c after postincrement: %d%n", c);	// Imprime 6
	}
	
}
