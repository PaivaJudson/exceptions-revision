package exceccao;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			int vetor[] = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1/0;
			
			System.out.println("Esse texto não será impresso");
		}catch(ArrayIndexOutOfBoundsException erro1) {
			System.err.println(erro1.getMessage());
		}
		catch(Throwable erro2) {
			System.err.println(erro2.getMessage());
			erro2.printStackTrace();
		}
	}

}
