package tareaAuto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author neril
 */
public class automovil {
    private String marca;
    private String submarca;
    private int anio;
    private int kilometraje;
    private String transmision;

    public automovil() {
    }

    public automovil(String marca, String submarca, int anio, int kilometraje, String transmision) {
        this.marca = marca;
        this.submarca = submarca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public int getAnio() {
        return anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void avanzar() {
        System.out.println("El auto esta avanzando " + (kilometraje/5)/20 + "km/hr" );
    }
    
    public void frenar() {
        System.out.println("El auto ha frenado");
    }
        
    
}
