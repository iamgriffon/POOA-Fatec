package Exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Novo notebook = new Novo(1000.00);
		Razoavel mouse = new Razoavel(60.00);
		ExcelenteEstado teclado = new ExcelenteEstado(355.50);
		
		
		mouse.setNome("Mouse gamer");
		teclado.setNome("Teclado Razer");
		notebook.setNome("Notebook Positivo");
		
		mouse.mostrarPreco();
		notebook.mostrarPreco();
		teclado.mostrarPreco();
	}
}
