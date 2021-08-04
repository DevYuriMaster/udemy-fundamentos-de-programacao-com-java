package Fundamentos;

import java.util.Scanner;

public class Basico {
	public static void main(String[] args) {
		System.out.println("Bom dia!");

		System.out.printf("O resltado da megaena é: %d %d %d %d %n ", 4, 6, 8, 9);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome:  ");
		String nome = entrada.nextLine();

		System.out.println("\n\n Nome:  " + nome);
	}
}
