package Junio;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean primo = true;
		int num;
		String respuesta;
		do {
			System.out.println("Introduce numero");
			num = sc.nextInt();
			for (int ind = 2; ind < num; ind++) {
				if (num % ind == 0) {
					primo = false;
				}
			}
			if (primo == true) {
				System.out.println(num + " es primo");
			} else {
				System.out.println(num + " no es primo");
			}

			System.out.println("Quieres intoducir otro numero? s/n");
		
			do {
				System.out.println("Tiene que pulsar la tecla S o N");
				respuesta = sc.next();
			} while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
			
		} while (respuesta.equalsIgnoreCase("s"));
	}
}