package cap06;

public class MethodOverload {

	
	// Teste de métodos square sobrecarregados
	public static void main(String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}
	
	// Método square com argumentos de int
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		
		return intValue * intValue;
	}
	
	// Método square com argumentos de double
	public static double square(double doubleValue) {
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		
		return doubleValue * doubleValue;
	}
	
}
