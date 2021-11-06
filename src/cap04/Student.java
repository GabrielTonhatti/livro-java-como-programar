package cap04;

public class Student {

	private String name;
	private double average;

	// Contrutor inicializ variáveis de instânica
	public Student(String name, double average) {
		this.name = name;

		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor padrão da média da variável de instância
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui à variável de instância
	}

	// Define o nome de Student
	public void setName(String name) {
		this.name = name;
	}

	// Recupera o nome de Student
	public String getName() {
		return name;
	}

	// Define a média de Student
	public void setAverage(double studentAverage) {
		// Valida que a média é > 0.0 e <= 100.0; caso constrário,
		// armazena o valor atual da média da variável de instância
		if (studentAverage > 0.0)
			if (studentAverage <= 100.0)
				this.average = studentAverage; // atribui à variável de instância
	}

	// Recupera a média de Student
	public double getAverage() {
		return average;
	}

	// Determina e retorna a letra da nota de Student
	public String getLetterGrade() {
		String letterGrade = ""; // Inicializa como uma String vazia

		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}

}	// Finaliza a classe Student
