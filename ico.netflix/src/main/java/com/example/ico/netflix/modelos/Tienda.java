package com.example.ico.netflix.modelos;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    ArrayList<Pelicula> rentadas;
    ArrayList<Pelicula> fila;
    ArrayList<List<Pelicula>> estante;
    int pago;

    public ArrayList<Pelicula> getRentadas() {
        return rentadas;
    }

    public void setRentadas(ArrayList<Pelicula> rentadas) {
        this.rentadas = rentadas;
    }

    public ArrayList<Pelicula> getFila() {
        return fila;
    }

    public void setFila(ArrayList<Pelicula> fila) {
        this.fila = fila;
    }

    public ArrayList<List<Pelicula>> getEstante() {
        return estante;
    }

    public void setEstante(ArrayList<List<Pelicula>> estante) {
        this.estante = estante;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public Tienda() {
        fila = new ArrayList<>();
        estante = new ArrayList<List<Pelicula>>();
        rentadas = new ArrayList<>();
        pago = 0;
        fila.add(new Pelicula(1, "Avatar", "162 minutos", 2009, 20, 11));
        fila.add(new Pelicula(2, "Titanic", "194 minutos", 1997, 20, 21));
        fila.add(new Pelicula(3, "Star Wars: El despertar de la fuerza", "138 minutos", 2015, 20, 32));
        fila.add(new Pelicula(4, "Avengers: Endgame", "181 minutos", 2019, 20, 14));
        fila.add(new Pelicula(5, "The Dark Knight", "152 minutos", 2008, 20, 25));
        fila.add(new Pelicula(6, "Harry Potter y las Reliquias de la Muerte - Parte 2", "130 minutos", 2011, 20, 6));
        fila.add(new Pelicula(7, "Frozen II", "103 minutos", 2019, 20, 17));
        fila.add(new Pelicula(8, "Beauty and the Beast", "129 minutos", 2017, 20, 28));
        fila.add(new Pelicula(9, "Furious 7", "137 minutos", 2015, 20, 19));
        fila.add(new Pelicula(10, "Avengers: Infinity War", "149 minutos", 2018, 20, 11));
        fila.add(new Pelicula(11, "The Lion King", "118 minutos", 2019, 20, 1));
        fila.add(new Pelicula(12, "Jurassic World", "124 minutos", 2015, 20, 12));
        fila.add(new Pelicula(13, "The Avengers", "143 minutos", 2012, 20, 32));
        fila.add(new Pelicula(14, "Fast and Furious 8", "136 minutos", 2017, 20, 4));
        fila.add(new Pelicula(15, "Frozen", "102 minutos", 2013, 20, 1));
        fila.add(new Pelicula(16, "Incredibles 2", "118 minutos", 2018, 20, 12));
        fila.add(new Pelicula(17, "Iron Man 3", "130 minutos", 2013, 20, 5));
        fila.add(new Pelicula(18, "Minions", "91 minutos", 2015, 20, 8));
        fila.add(new Pelicula(19, "Captain America: Civil War", "147 minutos", 2016, 20, 19));
        estante.add(fila.subList(0, 6));
        estante.add(fila.subList(6, 12));
        estante.add(fila.subList(12, 18));
    }


    @Override
    public String toString() {
        return "Tienda{" +
                "stock=" + estante +
                '}';
    }

    public boolean comprar(int id) {
        Pelicula peli = null;
        for (List<Pelicula> f : estante) {
            for (Pelicula pelicula : f) {
                if (pelicula.getId() == id) {
                    peli = pelicula;
                    rentadas.add(peli);
                    pago = pago + 20;
                    break;
                }
            }
        }
        if (peli != null) {
            return peli.vender();
        } else {
            return false;
        }
    }

    public boolean aceptar(int id) {
        Pelicula peli = null;
        for (List<Pelicula> f : estante) {
            for (Pelicula pelicula : f) {
                if (pelicula.getId() == id) {
                    peli = pelicula;
                    rentadas.remove(peli);
                    break;
                }
            }
        }
        if (peli != null) {
            return peli.regresar();
        } else {
            return false;
        }
    }

    public Pelicula cambiar(int id, Pelicula lp) {
        Pelicula peli = null;
        for (List<Pelicula> f : estante) {
            for (int i = 0; i < f.size(); i++) {
                if (f.get(i).getId() == id) {
                    peli = f.get(i);
                    f.set(i, lp);
                    break;
                }
            }
            if (peli != null) {
                return lp;
            }
        }
        return lp;
    }
}
