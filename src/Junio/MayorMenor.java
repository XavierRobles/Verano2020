package Junio;

import java.util.Scanner;

public class MayorMenor {

	Scanner sc = new Scanner(System.in);
	private int num1,num2;
	
	public void Datos() {
		System.out.println("Introduzca el primer numero");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2=sc.nextInt();

	}
	
	public void Calcular() {
		if (num1==num2) {
			System.out.println("Son iguales los dos numeros");
		}else
			
		
		if (num1>num2) {
			System.out.println("El numero mayor es "+num1);
			
		}else {
			System.out.println("El numero mayor es "+num2);
		}
		
	}

	public static void main(String[] args) {
		MayorMenor ss = new MayorMenor();
		ss.Datos();
		ss.Calcular();
		
	}
}
