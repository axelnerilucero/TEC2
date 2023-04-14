package com.example.ico.netflix.modelos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pelicula {
    private int id;
    private String nombre;
    private String duracion;
    private int anio;
    private int precio;
    private int cantidad;

    public boolean vender (){
        boolean resultado = false;
        if (cantidad >= 1){
            cantidad --;
            resultado = true;
        }
        return resultado;
    }
    public boolean regresar (){
        boolean resultado = false;
        if (cantidad >= 0){
            cantidad ++;
            resultado = true;
        }
        return resultado;
    }
}
