public class Asientos {
    public int precio = 0;
    public String numero = "";
    public int fila = 0;

    public Asientos() {
    }

    public Asientos(int precio, String numero, int fila) {
        this.precio = precio;
        this.numero = numero;
        this.fila = fila;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = this.numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Asientos{" +
                "precio=" + precio + " USD" +
                ", numero=" + numero +
                ", fila=" + fila +
                '}';
    }
}

