package Introducao;

public class Cliente {
	String nome;
	int codigo;
	int idade;
	String CPF;
	
	public void comprar() {
		System.out.println("Cliente efetuou uma compra");
	}
	
	public void apresentar() {
		System.out.println("Ola, meu nome e "+this.nome+ ", tenho "+this.idade+ " anos de idade, e meu CPF e igual a "+this.CPF);
	}
}
