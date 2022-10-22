package exercicio;

import java.util.*;

public class ex2 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			
			int precoHora = 10;
			int salario;
			int excesso;
			
			System.out.print("Insira codigo do funcionario: ");
			int c = input.nextInt();
			
			System.out.print("Insira numero de horas trabalhadas");
			int n = input.nextInt();
			
			if (n <= 50) {
				salario = n*precoHora;
				System.out.println("Voce trabalhou um total de: " + n + " horas trabalhadas");
				System.out.println("Total de ganhos: " + salario);
				System.out.println("Codigo do funcionario: " +c);
			}
			
			else {
				excesso = n - 50;
				salario = (50*precoHora) + excesso*20;
				
				System.out.println("Voce trabalhou um total de: " + n + " horas trabalhadas");
				System.out.println("Sendo que " + excesso + "dessas foram excedentes");
				System.out.println("Total de ganhos: " + salario);
				System.out.println("Codigo do funcionario: " +c);
				}
			}
		}
	}