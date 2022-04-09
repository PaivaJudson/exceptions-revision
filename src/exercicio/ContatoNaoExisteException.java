package exercicio;

public class ContatoNaoExisteException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		return "Contato "+nomeContato+" não existe na ordem indicada na agenda!";
	}
	
}
