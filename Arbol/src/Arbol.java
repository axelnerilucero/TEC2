public class Arbol {
    private String nombre;
    private String tipoDeHoja;
    private String tipoDeArbol;

    public Arbol() {
    }

    public Arbol(String nombre, String tipoDeHoja, String tipoDeArbol) {
        this.nombre = nombre;
        this.tipoDeHoja = tipoDeHoja;
        this.tipoDeArbol = tipoDeArbol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeHoja() {
        return tipoDeHoja;
    }

    public void setTipoDeHoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    public String getTipoDeArbol() {
        return tipoDeArbol;
    }

    public void setTipoDeArbol(String tipoDeArbol) {
        this.tipoDeArbol = tipoDeArbol;
    }

    public String dandoOxigeno(){
        return "Mucho oxigeno que dar";
    }
    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", tipoDeHoja='" + tipoDeHoja + '\'' +
                ", tipoDeArbol='" + tipoDeArbol + '\'' +
                '}';
    }
}
