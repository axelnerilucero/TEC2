/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Smart;

/**
 *
 * @author neril
 */
public class SmartTV {
    String definicion;
    int pulgadas;
    String marca; 
    boolean controlVoz;

    public SmartTV() {
    }

    public SmartTV(String definicion, int pulgadas, String marca, boolean controlVoz) {
        this.definicion = definicion;
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.controlVoz = controlVoz;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isControlVoz() {
        return controlVoz;
    }

    public void setControlVoz(boolean controlVoz) {
        this.controlVoz = controlVoz;
    }

    public void programando(){
        System.out.println("A continucaion se programaran automaticamente las funciones de su tv");
    }
    
    public String encendiendo() {
		return "Smart TV " + marca + " preparandose para encender";
    	
    }
    public String apagando() {
		return "Smart TV " + marca + " apagandose";
    	
    }
    
    @Override
    public String toString() {
    	return "Smart TV " + definicion + " marca " + marca + " de " + pulgadas + " pulgadas "; 
    }
    
    
}
