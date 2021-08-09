package Fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		// Operador ternário nada mais é 
		// do que uma atribuição condicional..
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.println("O aluno está " + resultado);
		
	}
}
