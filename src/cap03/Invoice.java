package cap03;

public class Invoice {

	private String numero;
	private String descricao;
	private int qtdeComprada;
	private double preco;

	Invoice(String numero, String descricao, int qtdComprada, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtdeComprada = qtdComprada;
		this.preco = preco;
	}
	
	public double getInvoiceAmount() {	
		return qtdeComprada * preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdeComprada() {
		return qtdeComprada;
	}

	public void setQtdeComprada(int qtdeComprada) {
		if (qtdeComprada > 0) {
			this.qtdeComprada = qtdeComprada;
		} else {
			this.qtdeComprada = 0;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0.0) {
			this.preco = preco;
		} else {
			this.preco = 0.0;
		}
	}

}
