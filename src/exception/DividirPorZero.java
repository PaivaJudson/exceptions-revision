package exception;

import java.util.Scanner;

public class DividirPorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informar  valor: ");
		int a = s.nextInt();
		
		System.out.print("Informar outro valor: ");
		int b = s.nextInt();
		
		System.out.println("Valor = "+ a / b);
	}

}
