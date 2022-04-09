package exceccao;

public class DivisaoNaoExacta extends Exception{
	
	private static final long serialVersionUID = 1L;
	private int num;
	private int denom;
	
	public DivisaoNaoExacta(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "O Resultado de "+num+ " / "+ denom+" não é inteiro";
	}
	
}
