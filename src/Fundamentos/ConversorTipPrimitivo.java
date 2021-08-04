package Fundamentos;

public class ConversorTipPrimitivo {
	public static void main(String[] args) {
		  double a = 1; // Conversão implícita
	        System.out.println(a);
	        
	        float b = (float) 1.5465638687575; //Conversão explícita (CAST)
	        System.out.println(b);
	        
	        int c = 340;
	        byte d = (byte) c; // Conversão Explícita 
	        System.out.println(d);
	        
	        double e = 1.999999999;
	        int f = (int) e; // Conversão explícita 
	        System.out.println(f);
	}
}
