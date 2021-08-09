package Fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//incremento prefixado
		
		a++; // a = a + 1
		a--; // b = b - 1
		
		//incremento posfixado
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);
		
		System.out.println(a);
		System.out.println(b);
		
						
	}
}
