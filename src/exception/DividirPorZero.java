package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try{
				System.out.print("Informar  valor: ");
				int a = s.nextInt();
				
				System.out.print("Informar outro valor: ");
				int b = s.nextInt();
				
				System.out.println("Resultado = "+ a / b);
				
				continua = false;
				
			}catch(ArithmeticException er) {
				System.err.println("o divisor não deve ser nulo...");
				
			}catch(InputMismatchException er) {
				System.err.println("Os números devem ser inteiros");
			}finally {
				s.nextLine();
				System.out.println("Finally executado...");
			}
				
		}while(continua);		
	}	
}
