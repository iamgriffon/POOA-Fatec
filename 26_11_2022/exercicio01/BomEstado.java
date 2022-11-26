package Exercicio01;

public class BomEstado extends Produto {
	public BomEstado(double preco) {
		setPreco(preco);
		ajustarPreco(0.8);
		this.temDesconto = true;
	}
}