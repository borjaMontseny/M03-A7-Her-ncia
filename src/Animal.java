
public class Animal {

	// PROPIEDADES
	protected String nom;
	protected int edat;
	protected double pes;

	// CONSTRUCTORES
	public Animal(String nom, int edat, double pes) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.pes = pes;
	}

	// MÉTODOS

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}
	
	public String correr() {
		return "L'animal terrestre està corrent.";
	}

	@Override
	public String toString() {
		return "nom: " + nom + ", edat: " + edat + ", pes: " + pes;
	}

}
