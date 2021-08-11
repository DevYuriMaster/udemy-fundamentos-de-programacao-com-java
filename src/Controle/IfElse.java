package Controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(
				"Informe o número:");
		int numero = Integer.parseInt(valor);
		
		//Sentença sem o else
		if(numero % 2 == 0 ) {
			System.out.println("Número Par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número impar!");
		} 
		
		//Sentença com o else
		if(numero % 2 == 0 ) {
			System.out.println("Número Par!");
		} else {
			System.out.println("Número Impar!");
		}
		
	}
}
