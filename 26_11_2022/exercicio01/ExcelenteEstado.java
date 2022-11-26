package Exercicio01;

public class ExcelenteEstado extends Produto {
	public ExcelenteEstado(double preco) {
		setPreco(preco);
		ajustarPreco(0.9);
		this.temDesconto = true;
	}
}