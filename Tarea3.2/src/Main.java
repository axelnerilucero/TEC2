import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asientos> fila = new ArrayList<>();
        String[] filas = {"","A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 1; i < filas.length-6; i++) {
            for (int x = 1; x < 9; x++) {
                fila.add(new Asientos(10, filas[i] + x, i));
            }
        }
        for (int i = 4; i < filas.length; i++) {
            for (int x = 1; x < 9; x++) {
                fila.add(new Asientos(6, filas[i] + x, i));
            }
        }
        ArrayList<List> teatro = new ArrayList<>();

        teatro.add(fila.subList(0,8));
        teatro.add(fila.subList(8,16));
        teatro.add(fila.subList(16,24));
        teatro.add(fila.subList(24,32));
        teatro.add(fila.subList(32,40));
        teatro.add(fila.subList(40,48));
        teatro.add(fila.subList(48,56));
        teatro.add(fila.subList(56,64));
        teatro.add(fila.subList(64,72));
        teatro.add(fila.subList(72,80));
        teatro.add(fila.subList(80,88));
        System.out.println(fila.size());
        System.out.println(teatro.toString());
    }
}