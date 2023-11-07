
public class Terrestre extends Animal {

	// PROPIEDADES
	protected String colorPel;

	// CONSTRUCTORES
	public Terrestre(String nom, int edat, double pes, String colorPel) {
		super(nom, edat, pes);
		this.colorPel = colorPel;
	}

	// MÉTODOS
	public String getColorPel() {
		return colorPel;
	}

	public void setColorPel(String colorPel) {
		this.colorPel = colorPel;
	}

	public String correr() {
		return "L'animal terrestre està corrent.";
	}

	@Override
	public String toString() {
		return super.toString() + " colorPel: " + colorPel;
	}

}
