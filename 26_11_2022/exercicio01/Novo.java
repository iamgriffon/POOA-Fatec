package Exercicio01;

public class Novo extends Produto {
	public Novo (double preco) {
		setPreco(preco);
		ajustarPreco(1.0);
		this.temDesconto = false;
	}
}