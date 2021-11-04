package cap03;

public class Account {

	private String name; // Variável de instância
	private double balance; // Variável de instância

	// O contrutor inicializa name com nome do parâmetro
	public Account(String name, double balance) { // O nome do construtor é o nome da classe
		this.name = name; // Atribui name à variável de instância name

		// Valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if (balance > 0.0) { // se o saldo for válido
			this.balance = balance; // O atribui à variável de instância balance
		}
	}

	// Método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) { // se depositAmount for válido
			balance = balance + depositAmount; // O adiciona ao saldo
		}
	}
	
	// Método que retorna o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	// Método para retirar saldi da conta
	public void withDraw(double withDraw) {
		if(withDraw <= balance) {
			balance = balance - withDraw;
		} else {
			System.out.println("\nWithDrawal amount exceeded account balance!");
		}
	}

	// Método para definir o nome no objeto
	public void setName(String name) {
		this.name = name; // Armazena o nome
	}

	// Método para recuperar o nome do objeto
	public String getName() {
		return name; // Retorna o valor do noem para o chamador
	}

} // Fim da classe Account
