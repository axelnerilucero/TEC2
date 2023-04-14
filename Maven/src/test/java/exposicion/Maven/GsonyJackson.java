package exposicion.Maven;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class GsonyJackson {
	public static void main(String[] args) {
		//Jackson
		System.out.println("Aqui con jackson");
        Cancion c1 = new Cancion("Las mananitas", "Tatiana", "3:21");
        ObjectMapper mapeador = new ObjectMapper();
        try {
            String strCancion = mapeador.writeValueAsString(c1);
            System.out.println(c1);
            System.out.println(strCancion);
            System.out.println("De json a objeto");
            // con el json de StrCancion crearemos el objeto
            Cancion c4 = new ObjectMapper().readValue(strCancion, Cancion.class);
            System.out.println(c4 + "\n");
        }catch (Exception e){
            System.out.println(e);
        }
        
        // gson
        System.out.println("Aqui con gson");
        Cancion c2 = new Cancion("Las Mananitas", "Topogigo", "3:16");
        String strSong = new Gson().toJson(c2);
        System.out.println(c2);
        System.out.println(strSong);
        System.out.println("De json a objeto");
        // con el json de StrSong crearemos el objeto
        Cancion c3 = new Gson().fromJson(strSong, Cancion.class);
        System.out.println(c3);
    }
}
