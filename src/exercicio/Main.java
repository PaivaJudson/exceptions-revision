package exercicio;

public class Main {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Judson Paiva", "999999", "judson.paiva@isptec.co.ao");
		Contato c2 = new Contato("Leonor Paiva", "999999", "judson.paiva@isptec.co.ao");
		Contato c3 = new Contato("Ageu Paiva", "999999", "judson.paiva@isptec.co.ao");
		//System.out.println("Id = "+ c3.getId());
		
		Agenda listaContato = new Agenda();
		
		try {
			listaContato.adicionar(c3, 0);
			listaContato.adicionar(c2, 1);
			listaContato.adicionar(c1, 3);
			listaContato.adicionar(c3, 2);
			listaContato.adicionar(c1, 4);
	
			System.out.println(listaContato.consultarPorNome("Ageu Paiva", 3));
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
		} catch(ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
