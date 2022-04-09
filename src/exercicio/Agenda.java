package exercicio;

import java.util.Arrays;

public class Agenda {

	private Contato[] lista;
	
	public Agenda() {
		lista = new Contato[5];
	}
	
	public boolean adicionar(Contato contato, int posicao) throws AgendaCheiaException {
		if(posicao >=0 && posicao <=4 ) {
			if(lista[posicao] == null) {
				lista[posicao] = contato;
				return true;
			}else if(posicao == 4 & lista[posicao] !=null){
				throw new AgendaCheiaException();
			}
		}
		throw new AgendaCheiaException();
	}

	public String consultarPorNome(String nome, int posicao) throws ContatoNaoExisteException {
		if(posicao >=0 && posicao <=4 ) {
			if(lista[posicao] != null) {
				Contato contato = lista[posicao];
				if(contato.getNome().equalsIgnoreCase(nome)) {
					return contato.toString();
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
	}
	
	@Override
	public String toString() {
		return "Agenda [" + Arrays.toString(lista) + "]";
	}
	
	
	
}
