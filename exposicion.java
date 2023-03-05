public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Jose");
        nombres.add("Marcos");
        nombres.add("Diana");
        nombres.add("Diego");
        System.out.println(nombres);
        nombres.add(1, "Jesus");
        System.out.println(nombres);
        System.out.println(nombres.size());
        System.out.println(nom);
        nombres.set(1, "María");
        System.out.println(nombres);
        System.out.println("--- nombres oredenados ---");
        Collections.reverse(nombres);
        System.out.println(nombres);
    }
}