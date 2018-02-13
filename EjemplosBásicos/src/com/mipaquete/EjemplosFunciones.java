package com.mipaquete;

public class EjemplosFunciones {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			System.out.println("V3 - Programa Funciones");
			// Empezando
			int x = 3;
			int y = 5;
			int resultadoSuma = sumarNumeros(x, y);
			int resultadoResta = restarNumeros(x, y);
			int resultadoMultiplicacion = multiplicarNumeros(x, y);	
			System.out.println("Resultado = " + resultadoSuma);
			System.out.println("Resultado = " + resultadoResta);
			System.out.println("Resultado = " + resultadoMultiplicacion);
			System.out.println("Resultado cuadrado = " + alCuadrado(6));
			System.out.println("Resultado cuadrado = " + alCubo(11111));
		}
		
				public static int multiplicarNumeros(int valor_1, int valor_2) {
					return valor_1 * valor_2;
				}
				public static int sumarNumeros(int valor_1, int valor_2) {
					return valor_1 + valor_2;
				}
				public static int restarNumeros(int valor_1, int valor_2) {
					return valor_1 - valor_2;
				}
				public static int alCuadrado(int v) {
					int resultado = v * v;
					return resultado;
				}
				public static double alCubo(int l) {
					double resultadoCubo = Math.pow(l, 3);
					return resultadoCubo;
				}
}