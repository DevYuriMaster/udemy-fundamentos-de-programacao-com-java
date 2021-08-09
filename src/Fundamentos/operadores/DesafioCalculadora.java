package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
	    double num2 = entrada.nextDouble();
	    
	    System.out.println("informe a operação: ");
		String op = entrada.next();
	    
		//Lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0; 
		resultado = "-" .equals(op) ? num1 - num2 : resultado;
		resultado = "*" .equals(op) ? num1 * num2 : resultado;
		resultado = "/" .equals(op) ? num1 / num2 : resultado;
		resultado = "%" .equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.25f %s %2.f = %.2f", num1, op, num2, resultado);
		
		
		entrada.close();
		
		
		
		
	}
}
