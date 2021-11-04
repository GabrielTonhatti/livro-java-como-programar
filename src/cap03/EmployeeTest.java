package cap03;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee func1 = new Employee("Rafaela", "Oliveira", 105500);
		Employee func2 = new Employee("Gabriel", "Tonhatti", 98219.99);

		System.out.printf("%nFuncionário(a) %s %s tem o salário anual de R$ %.2f", func1.getNome(), func1.getSobrenome(),
				func1.getSalario());
		System.out.printf("%nFuncionário(a) %s %s tem o salário anual de R$ %.2f%n", func2.getNome(), func2.getSobrenome(),
				func2.getSalario());
			
		func1.aumento();
		func2.aumento();
		
		System.out.printf("%nFuncionário(a) %s %s tem o salário anual de R$ %.2f", func1.getNome(), func1.getSobrenome(),
				func1.getSalario());
		System.out.printf("%nFuncionário(a) %s %s tem o salário anual de R$ %.2f%n", func2.getNome(), func2.getSobrenome(),
				func2.getSalario());
			

	}

}
