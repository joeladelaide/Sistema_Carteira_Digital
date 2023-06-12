package Programa;

public class Criptoativo extends Criptomoeda {
	
	private static int contador = 1;
	
	protected int idCriptoativo;
	protected Criptomoeda criptomoeda;
	protected Double quantidade = 0.0;
	
    public Criptoativo(Criptomoeda criptomoeda, String nome, String sigla, String exchange) {
		super(nome, sigla, exchange);
		this.idCriptoativo = contador;
		this.criptomoeda = criptomoeda;
		contador += 1;
	}

    // Getter para obter o identificador da criptomoeda
	public int getIdCriptoativo() {
		return idCriptoativo;
	}
}
