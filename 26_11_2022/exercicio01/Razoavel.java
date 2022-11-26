package Exercicio01;

public class Razoavel extends Produto {
	public Razoavel(double preco) {
		setPreco(preco);
		ajustarPreco(0.6);
		this.temDesconto = true;
	}
}