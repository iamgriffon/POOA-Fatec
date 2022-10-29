package Introducao;

public class Exemplo1 {

	public static void main(String[] args) {
		Caneta bic = new Caneta(); //Classe objeto = new Metodo Construtor 
		
		System.out.println("Antes de instanciar valores \n");
		bic.estado();
		
		/* Definindo atributos */
		bic.carga = 100;
		bic.cor = "azul";
		bic.ponta = 0.7;
		
		System.out.println("\nApos instanciar valores");
		bic.estado();
		
		System.out.println("\nTestando metodo escrever()\n");
		bic.escrever();
		System.out.println("\nAgora vou tampar a caneta \n");
		bic.tampar();
		bic.escrever();
		System.out.println("\nAgora vou instanciar uma caneta nova\n");
		
		// ----------------------- //
		
		Caneta kilometrica = new Caneta();
		kilometrica.carga = 10;
		kilometrica.cor = "preta";
		kilometrica.ponta = 0.5;
		kilometrica.tampar();
		kilometrica.estado();
	}
	
	

}
