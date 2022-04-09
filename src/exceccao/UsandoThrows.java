package exceccao;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("informe um valor decimal: ");
		try {
			double val = lerNumero();
			System.out.println("você digitou: "+val);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
	}
	
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
