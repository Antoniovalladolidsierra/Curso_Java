package com.incyde;

import java.util.Scanner;

public class ProgramaPrincipal {

	static float capital;
	static float precio = 7.5f;

	static int horaCine_1 = 17;
	static int horaCine_2 = 19;
	static int horaCine_3 = 21;
	static int horaDeseada;
	static int horaRecomendada;

	static String nombre;

	static Scanner teclado;

	public static void main(String[] args) {
		boolean resultadoCine;

		teclado = new Scanner(System.in);
		String Sicontinuar;

		System.out.println("Programa Cine 4");
		do {
			pedirNombres();
			pedirDatos();
			comprobarSiVamosAlCine();
			resultadoCine = comprobarSiVamosAlCine();
			mostrarResultado(resultadoCine);
			System.out.println("�Desea continuar (s/n)?");
			teclado.nextLine();
			Sicontinuar = teclado.nextLine();
		} while (Sicontinuar.equals("s") || Sicontinuar.equals("S"));
		teclado.close();
		System.out.println("Que pasen un buen d�a :)");
	}

	public static void pedirNombres() {
		System.out.println("Introduzcan sus nombres ");
		nombre = teclado.nextLine();
		System.out.println("Buenas " + nombre);
		return;
	}

	public static void pedirDatos() {
		System.out.println("El precio de la entrada son 7,50$.");
		System.out.println("Indiquen el dinero que tienen.");
		capital = teclado.nextFloat();
		System.out.println("Indique la hora deseada");
		horaDeseada = teclado.nextInt();
		return;
	}

	public static boolean comprobarSiVamosAlCine() {
		if (capital >= precio) {
			if (horaDeseada <= horaCine_1 && horaDeseada >= horaCine_1 - 1) {
				horaRecomendada = horaCine_1;
				return true;
			} else if (horaDeseada <= horaCine_2 && horaDeseada >= horaCine_1 - 1) {
				horaRecomendada = horaCine_2;
				return true;
			} else if (horaDeseada <= horaCine_3 && horaDeseada >= horaCine_1 - 1) {
				horaRecomendada = horaCine_3;
				return true;
			}
		}
		return false;

	}

	public static void mostrarResultado(boolean resultado) {
		System.out.println("La hora recomendada es " + horaRecomendada);
		if (resultado == true) {
			System.out.println("S� podemos ir al cine");
		} else {
			System.out.println("No podemos ir al cine");
		}
	}
};