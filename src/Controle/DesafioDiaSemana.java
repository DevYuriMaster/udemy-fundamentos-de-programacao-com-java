package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero que "
				+ "representa um dia da semana de 1 a 7");
		
		Scanner entrada = new Scanner(System.in);
		
		int dia = entrada.nextInt();
		
		
		if( dia < 1 || dia > 7) {
			System.out.println("Dia inexistente!");
		} else if(dia <= 1) {
			System.out.println("Hoje � Domingo p� de cachimbo");
		} else if(dia <= 2) {
			System.out.println("Hoje � Segunda Maledita");
		} else if(dia <= 3) {
			System.out.println("Hoje � Ter�a neutra");
		} else if(dia <= 4) {
			System.out.println("Hoje � Quarta tranquila");
		} else if(dia <= 5) {
			System.out.println("Hoje � Quinta, quase sexta");
		} else if(dia <= 6) {
			System.out.println("Hoje � dia do Sextou nessa porra");
		} else if(dia <= 7) {
			System.out.println("Hoje � S�bado de Sol");
		} else {
			System.out.println("Que dia � esse?");
		} 
			
		
		System.out.println("Boa Semana!");
		
		entrada.close(); 
	}
}
