package exercicio;

import java.util.*;

public class ex1 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.printf("Insira a quantidade de kgs de tomate: ");
			int p = input.nextInt();
			int m, e;
			
			if(p <= 50) System.out.println("ZERO MULTA, PESAGEM MENOR DO QUE 50");
			else {
				e = p - 50;
				m = e*4;
				System.out.println("Voce tem " + e + " kg em excesso, logo devera pagar " + m + " reais");
			}
			
		}
	}
}
