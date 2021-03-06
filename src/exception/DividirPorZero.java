package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZero {
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
		
		System.out.print("Informar  valor: ");
		int a = s.nextInt();
		
		System.out.print("Informar outro valor: ");
		int b = s.nextInt();
		
		System.out.println("Resultado = "+ a / b);	
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		
		
		do {
			try{
				dividir(s);
				
				continua = false;
				
			}catch(ArithmeticException | InputMismatchException er) {
				System.err.println("O valor inserido é inválido!");
				er.printStackTrace();
			}finally {
				s.nextLine();
				System.out.println("Finally executado...");
			}
				
		}while(continua);		
	}	
}
