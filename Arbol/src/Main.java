import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arbol> bosque = new ArrayList<>();
        bosque.add(new Arbol("Pino", "caduca", "ornamental"));
        bosque.add(new Arbol("Fresno", "perenne", "ornamental"));
        bosque.add(new Arbol("Kaoba", "caduca", "ornamental"));
        System.out.println(bosque);
        /*
        for (Arbol arbolito: bosque) {
            System.out.println(arbolito.dandoOxigeno());
            System.out.println(arbolito.toString());
        }
        */
    }
}