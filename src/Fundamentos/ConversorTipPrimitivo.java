package Fundamentos;

public class ConversorTipPrimitivo {
	public static void main(String[] args) {
		  double a = 1; // Convers�o impl�cita
	        System.out.println(a);
	        
	        float b = (float) 1.5465638687575; //Convers�o expl�cita (CAST)
	        System.out.println(b);
	        
	        int c = 340;
	        byte d = (byte) c; // Convers�o Expl�cita 
	        System.out.println(d);
	        
	        double e = 1.999999999;
	        int f = (int) e; // Convers�o expl�cita 
	        System.out.println(f);
	}
}
