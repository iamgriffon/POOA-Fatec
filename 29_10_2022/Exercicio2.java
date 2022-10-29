package Introducao;

public class Exercicio2 {	

	public static void main(String[] args) {
		Aviao boeing = new Aviao("BOEING 747 BOLADO", 524, 20, false);
		boeing.status();
		boeing.capacidadeMax = 524;
		boeing.cargaCombustivel = 20;
		boeing.voar();
		boeing.status();
	}
}
