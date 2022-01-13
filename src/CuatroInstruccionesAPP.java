
public class CuatroInstruccionesAPP {

	public static void main(String[] args) {
		
		 int A = 10, B = 20, C = 30, D = 40, AUX;
		                                                                  
	        System.out.println("Valor inicial de A = " + A);
	        System.out.println("Valor inicial de B = " + B);
	        System.out.println("Valor inicial de C = " + C);
	        System.out.println("Valor inicial de D = " + D);
			System.out.print("\n"); //Salto de linea
	        AUX = B;
	        B = C;
	        C = A;
	        A = D;
	        D = AUX;
	        System.out.println("B toma el valor de C -> B = " + B);
	        System.out.println("C toma el valor de A -> C = " + C);
	        System.out.println("A toma el valor de D -> A = " + A);
	        System.out.println("D toma el valor de B -> D = " + D); 

	}

}
