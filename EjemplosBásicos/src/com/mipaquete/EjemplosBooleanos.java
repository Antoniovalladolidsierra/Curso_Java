package com.mipaquete;

public class EjemplosBooleanos {

	public static void FuncionPrincipal() {
		// TODO Auto-generated method stub
			System.out.println("Ejemplos Booleanos");
			
		int a = 2;
		int b= 2;
		operadoresComparacion(a, b);
	}
		public static void operadoresComparacion(int a, int b) {
		
		if (a == b) 
			System.out.println(a + " Es igual a " + b);
	else 
		if (a > b) 
			System.out.println(a + " mayor que " + b);
	else 
		if (a < b) 
			System.out.println(a + " menor que " + b);
	else 
		if (a != b) 
			System.out.println("No se");
	else 
		if (a <= b) 
			System.out.println(a + " mayor o igual que " + b);
	else 
		if (a >= b) 
			System.out.println(a + " menor o igual que " + b);
	}

}
