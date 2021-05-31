package Domain;

public class Unidade extends Numero {

	private float valor;

	public Unidade() {
	}

	public Unidade(String label, float valor) {
		super(label);
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
