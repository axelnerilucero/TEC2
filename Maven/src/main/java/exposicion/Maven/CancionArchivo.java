package exposicion.Maven;
import java.io.*;

public class CancionArchivo {
	// Serializar
    public static void guardarCancion(Cancion cancion, String archivo) throws IOException {
        // objeto para guardar en archivo
    	FileOutputStream fileOutputStream = new FileOutputStream(archivo);
    	// objeto para escribir los datos en el archivo
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //escribimos en el archivo la cancion
        objectOutputStream.writeObject(cancion);
        objectOutputStream.close();
    }
    // Deserializar
    public static void mostrarCancion(String archivo) throws IOException, ClassNotFoundException {
    	// obtiene bytes como entrada
        FileInputStream fileInputStream = new FileInputStream(archivo);
        // deserializa los datos u objetos
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // lee el objeto que deserializo y crea el objeto
        Cancion cancion = (Cancion) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(cancion);
       
    }
}