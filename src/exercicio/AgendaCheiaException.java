package exercicio;

public class AgendaCheiaException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}
