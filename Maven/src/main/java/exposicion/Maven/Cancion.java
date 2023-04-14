package exposicion.Maven;
import java.io.Serializable;

public class Cancion implements Serializable{
    private String nombre;
    private String artista;
    private String duracion;

    public Cancion(){

    }
    public Cancion(String nombre, String artista, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", Artista='" + artista + '\'' +
                ", Duracion='" + duracion + '\'' +
                '}';
    }
}

