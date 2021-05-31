package Domain;

public class Dezena extends Numero {

	private int valor;
	

	public Dezena() {
	}
	
	public Dezena(String label, int valor) {
		super(label);
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}	
}
