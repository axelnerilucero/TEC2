package exposicion.Maven;
import com.google.gson.Gson;

public class CancionGson {
	 public static void main(String[] args) {
        Cancion c2 = new Cancion("Las Mañanitas", "Topogigo", "3:16");
        String strSong = new Gson().toJson(c2);
        System.out.println(c2);
        System.out.println(strSong);
    }
}
