package ico.fes.front.ejemplomvc.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Automovil {
    private int id;
    private String marca;
    private String submarca;
    private int modelo;
    private String descripcion;
    private String urlImagen;
}
