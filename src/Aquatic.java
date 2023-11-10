
public class Aquatic extends Animal {

	// PROPIEDADES

	// CONSTRUCTORES
	public Aquatic(String nom, int edat, double pes) {
		super(nom, edat, pes);
	}

	// MÉTODOS
	public String correr() {
		return "L'animal marí està  nedant.";
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
