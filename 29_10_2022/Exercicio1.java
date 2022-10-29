package Introducao;

public class Exercicio1 {
	public static void main(String[] args) {
		Cliente user = new Cliente();
		user.nome = "Jorgin da borracharia";
		user.codigo = 42069;
		user.idade = 24;
		user.comprar();
		user.apresentar();
	}
}
