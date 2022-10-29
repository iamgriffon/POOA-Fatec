package Introducao;

public class Aviao {
			String modelo;
			int capacidadeMax;
			int cargaCombustivel;
			boolean estaNoAr;

			public Aviao(String string, int i, int j, boolean b) {
				this.modelo = string;
				this.capacidadeMax = i;
				this.cargaCombustivel = j;
				this.estaNoAr = b;
			}

			public void voar() {
				if (this.estaNoAr == true)
					System.out.println("\nERROR: Já estou voando!");
				else if (this.estaNoAr == false && this.cargaCombustivel > 0)
					System.out.println("\nDecolando");
				else
					System.out.println("ERROR: Estou sem combustivel!");

			}

			public void pousar() {
				if (this.estaNoAr == true)
					System.out.println("Aterrisando!");
				else
					System.out.println("ERROR: Já estou no chão");
			}

			public void status() {
				System.out.println("Esse aviao de modelo: " + this.modelo);
				System.out.println("Esse aviao tem capacidade maxima de: " + this.capacidadeMax + " passageiros");
				System.out.println("Esse aviao tem: " + this.cargaCombustivel + "% de combustivel");
				
				if (this.estaNoAr == true) System.out.println("Esse aviao esta no ar");
				else System.out.println("Esse aviao NAO esta no ar");
			}
}
