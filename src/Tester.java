
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal gremlin = new Animal("Gizmo", 2, 1.5);
		Terrestre lleona = new Lleona("Nala", 6, 98.5, "Marró");
		Serp serp = new Serp("Margarida", 4);
        //Dofi dofi = new Dofi("Flipper", 8);
        //Animal aliga = new Aliga("Thunder", 4);
		
        System.out.println(gremlin);
        System.out.println(gremlin.getPes());
        System.out.println(gremlin.getNom());
        System.out.println(gremlin.getEdat());
        
        System.out.println();
        
        System.out.println(lleona);
        System.out.println(lleona.getColorPel());

        System.out.println();

        System.out.println(serp);
        serp.fesSo();
		    serp.getPes();
        serp.correr();

        System.out.println();
	}

}
