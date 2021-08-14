package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		System.out.println("Digite um número que "
				+ "representa um dia da semana de 1 a 7");
		
		Scanner entrada = new Scanner(System.in);
		
		int dia = entrada.nextInt();
		
		
		if( dia < 1 || dia > 7) {
			System.out.println("Dia inexistente!");
		} else if(dia <= 1) {
			System.out.println("Hoje é Domingo pé de cachimbo");
		} else if(dia <= 2) {
			System.out.println("Hoje é Segunda Maledita");
		} else if(dia <= 3) {
			System.out.println("Hoje é Terça neutra");
		} else if(dia <= 4) {
			System.out.println("Hoje é Quarta tranquila");
		} else if(dia <= 5) {
			System.out.println("Hoje é Quinta, quase sexta");
		} else if(dia <= 6) {
			System.out.println("Hoje é dia do Sextou nessa porra");
		} else if(dia <= 7) {
			System.out.println("Hoje é Sábado de Sol");
		} else {
			System.out.println("Que dia é esse?");
		} 
			
		
		System.out.println("Boa Semana!");
		
		entrada.close(); 
	}
}
