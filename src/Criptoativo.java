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
    // Setter para definir o identificador da criptomoeda
	public void setIdCriptoativo(int idCriptoativo) {
		this.idCriptoativo = idCriptoativo;
	}

    // Getter para obter a criptomoeda associada ao criptoativo
	public Criptomoeda getCriptomoeda() {
		return criptomoeda;
	}

	// Setter para definir a criptomoeda associada ao criptoativo
	public void setCriptomoeda(Criptomoeda criptomoeda) {
		this.criptomoeda = criptomoeda;
	}
}
