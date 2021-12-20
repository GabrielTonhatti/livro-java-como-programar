package cap05;

public class AutoPolicy {

	private int accountNumber; // Número da conta da apólice
	private String makeAndModel; // Carro ao qual a apólice é aplicada
	private String state; // Abreviatura do estado com duas letras

	// Construtor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	// Define o accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Retorna o accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}

	// Configura o makeAndModel
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	// Retorna o makeAndModel
	public String getMakeAndModel() {
		return makeAndModel;
	}

	// Define o state
	public void setState(String state) {
		this.state = state;
	}

	// Retorna o state
	public String getState() {
		return state;
	}

	// Método predeicado é retornado se o estado tem seguros "sem culpa"
	public boolean isNoFaultState() {
		boolean noFaultState;

		// Determina se o estado tem seguros de automóvel "sem culpa"
		switch (getState()) { // obtém a abreviatura do estado do objeto AutoPolicy
			case "MA":
			case "NJ":
			case "NY":
			case "PA":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
		}
		
		return noFaultState;
	}

}
