package Introducao;

public class Caneta {

	// ATRIBUTOS
	String cor;
	double ponta;
	int carga;
	boolean estarTampada;
	
	/* 
	//INSTANCIANDO CONSTRUCTOR
	public Caneta(String string, double a, boolean d) {
		this.cor = string;
		this.ponta = a;
		this.carga = 100;
		this.estarTampada = d;
	}
	*/

	// METODOS = COMPORTAMENTOS
	public void escrever() {
		if (this.estarTampada == true) {
			System.out.println("ERRO caneta tampada");
		} else {
			System.out.println("Escrevendo....");
		}
	}
	
	public void tampar() {
		this.estarTampada = !this.estarTampada; 
	}
	
	
	public void estado() {
		System.out.println("Cor: "+ this.cor);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Está tampada? " + this.estarTampada);
		System.out.println("A carga está em " + this.carga+"%");
	}
	
}
