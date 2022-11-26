package Exercicio01;

public class Produto {
	private String nome, descricao;
	protected boolean temDesconto;
	public double preco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String nome) {
		this.descricao = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double ajustarPreco(double desconto) {
		if (desconto == 1.0) this.temDesconto = false;
		else this.temDesconto = true;
		return this.preco = preco*desconto;
	}
	
	public void mostrarPreco() {
		System.out.println("Nome do produto: " + this.nome + "\n");
		System.out.println("Descricao do Produto: " + this.descricao + "\n");
		System.out.println("Preco do produto: R$" + this.preco + "\n");
		
		if (this.temDesconto == true) System.out.println("Esse produto possui desconto \n");
		else if (!this.temDesconto) System.out.println("Esse produto nao possui desconto \n");
	}
}