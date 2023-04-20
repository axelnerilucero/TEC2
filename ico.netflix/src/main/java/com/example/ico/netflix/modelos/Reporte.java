package com.example.ico.netflix.modelos;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Reporte {
    Date fecha;
    Pelicula pelicula;
    String accion;
}
