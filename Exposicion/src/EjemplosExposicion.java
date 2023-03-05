import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;

public class EjemplosExposicion {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martimiercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Domingo");
        System.out.println("Dias incompletos y mal escritos = " + dias);
        dias.add(2, "Miercoles");
        System.out.println("Se agrego el miercoles " + dias);
        dias.set(1, "Martes");
        System.out.println("Se escribio bien el segundo dia " + dias);
        dias.add(5, "Sabado");
        System.out.println("Dias completos = " + dias);
    }
}
