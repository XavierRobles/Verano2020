package Junio;

import java.util.Scanner;

public class PositivoNegativo {
	Scanner sc = new Scanner(System.in);
	private int num;

	public void PedirNumero() {
		System.out.println("Introduzca un numero");
		num = sc.nextInt();

	}

	public void Comprobar() {

		

			if (num > 0) {
				System.out.println("El numero Es positivo");
			}
			else if(num ==0) {
				System.out.println("El numero Es neutro");
				
			}
			else {
				System.out.println("El numero Es negativo");
			}

			if (num!=0) {
				
			
			if (num % 2 == 0) {
				System.out.println("El numero es par");

			} else
				System.out.println("El numero Es Impar");

			}else {
				System.out.println("El 0 no se puede dividir");
			}
	}
	
	public static void main(String[] args) {
		PositivoNegativo ss = new PositivoNegativo();
		ss.PedirNumero();
		ss.Comprobar();
	}
}
