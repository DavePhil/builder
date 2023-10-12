import monteur.MonteurPizza;
import monteur.MonteurPizzaPiquante;
import monteur.MonteurPizzaReine;

// Classe cliente qui demande au directeur de lui
public class Main {
    public static void main(String[] args) {
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        Directeur directeur = new Directeur();
        System.out.println("************** Debut **************");
        System.out.println("Construction de la pizza Reine");
        directeur.setMonteurPizza(monteurPizzaReine);
        directeur.construire();
        System.out.println("Construction de la pizza Piquante");
        directeur.setMonteurPizza(monteurPizzaPiquante);
        directeur.construire();
        System.out.println("************** Fin **************");

    }
}