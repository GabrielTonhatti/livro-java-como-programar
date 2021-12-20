package cap05;

public class BreakTest {

	public static void main(String[] args) {
		int count; // Variável de controle também utilizada depois que o loop termina
		
		for(count = 1; count <= 10; count++) { // Faz o loop 10 vezes
			
			if(count == 5) break; // Termina o loop se a contagem for 5
			
			System.out.printf("%d ", count);
			
		}
		
		System.out.printf("%nBroken out of loop at count = %d%n", count);
	}
	
}
