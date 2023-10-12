import monteur.MonteurPizza;
import monteur.MonteurPizzaLocale;
import monteur.MonteurPizzaPiquante;
import monteur.MonteurPizzaReine;

// Classe cliente qui demande au directeur de lui
public class Main {
    public static void main(String[] args) {
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurPizzaLocale = new MonteurPizzaLocale();
        Directeur directeurP = new Directeur(monteurPizzaPiquante);
        Directeur directeurL = new Directeur(monteurPizzaLocale);
        Directeur directeurR = new Directeur(monteurPizzaReine);
        System.out.println("************** Debut **************");
        System.out.println("Construction de la pizza Reine");
        directeurR.construire();
        System.out.println("Construction de la pizza Locale");
        directeurL.construire();
        System.out.println("Construction de la pizza Piquante");
        directeurP.construire();
        System.out.println("************** Fin **************");

    }
}