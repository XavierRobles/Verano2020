package Junio;

import java.util.Scanner;

public class SumaParesImpares {
	Scanner sc = new Scanner(System.in);
	private int cantidad, num, CountPar, counP, counI, CountImpar;

	public void SolicitarDatos() {

		System.out.println("Introduzca la cantidad de numeros a calcular");

		cantidad = sc.nextInt();

	}

	public void Calcular() {

		for (int i = 1; i <= cantidad; i++) {

			if (i % 2 == 0) {
				CountPar += i;
				counP++;
			} else {
				CountImpar += i;
				counI++;
			}
		}

		System.out.println("Cantidade de pares es " + counP + " la suma de los pares es " + CountPar);
		System.out.println("Cantidade de Impares es " + counI + " la suma de los Impares es " + CountImpar);
	}

	public static void main(String[] args) {
		SumaParesImpares op = new SumaParesImpares();
		op.SolicitarDatos();
		op.Calcular();
	}
}
