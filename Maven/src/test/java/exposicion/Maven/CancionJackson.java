package exposicion.Maven;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CancionJackson {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Las mañanitas", "Tatiana", "3:21");
        ObjectMapper mapeador = new ObjectMapper();
        try {
            String strCancion = mapeador.writeValueAsString(c1);
            System.out.println(strCancion);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}