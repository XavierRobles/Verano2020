package Junio;
import java.util.Scanner;

public class Factorial {

	private int fact, num;

	public void SolicitarDatos() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el Numero a factorizar");
		num = sc.nextInt();

	}

	public void Operacion() {
		fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;

		}
	}

	public void Imprimir() {

		System.out.println("El numero Factorial es: " + fact);
	}

	public static void main(String[] args) {

		Factorial op = new Factorial();
		op.SolicitarDatos();
		op.Operacion();
		op.Imprimir();
	}
}
