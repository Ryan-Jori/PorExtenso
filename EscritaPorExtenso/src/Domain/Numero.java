package Domain;

public abstract class Numero {

	private String label;
	

	public Numero() {
	}

	public Numero(String label) {
		super();
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
