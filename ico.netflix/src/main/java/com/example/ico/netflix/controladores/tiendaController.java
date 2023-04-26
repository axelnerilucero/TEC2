package com.example.ico.netflix.controladores;

import com.example.ico.netflix.modelos.Pelicula;
import com.example.ico.netflix.modelos.Reporte;
import com.example.ico.netflix.modelos.Tienda;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class tiendaController {
    Tienda tienda;

    public tiendaController() {
        tienda = new Tienda();
    }

    @GetMapping("/stock")
    public ResponseEntity<ArrayList<List<Pelicula>>> getStock(){
        return new ResponseEntity<>(tienda.getEstante(), HttpStatus.OK);
    }

    @GetMapping("/stock/{id}")
    public ResponseEntity<Pelicula> regresarPeliById(@PathVariable(required = true, name = "id") int id){
        return new ResponseEntity<>(tienda.buscar(id), HttpStatus.OK);
    }
    @PostMapping("/rentar/{id}")
    public ResponseEntity<Boolean> rentar(@PathVariable(required = true, name = "id") int id){
        return new ResponseEntity<>(tienda.comprar(id), HttpStatus.OK);
    }

    @PostMapping("/regresar/{id}")
    public ResponseEntity<Boolean> regresar(@PathVariable(required = true, name = "id") int id){
        return new ResponseEntity<>(tienda.aceptar(id), HttpStatus.OK);
    }

    @GetMapping("/reporte/rentas")
    public ResponseEntity<ArrayList<Reporte>> getRentadas(){
        return new ResponseEntity<>(tienda.getReportes(), HttpStatus.OK);
    }

    @PatchMapping("cambiar")
    public ResponseEntity<Pelicula> cambiar(@RequestBody Pelicula pelicula){
        return new ResponseEntity<>(tienda.cambiar(pelicula.getId(), pelicula), HttpStatus.OK);
    }

    @GetMapping("/reporte/balance")
    public ResponseEntity<Integer> getBalance(){
        return new ResponseEntity<>(tienda.getPago(), HttpStatus.OK);
    }



    @PostMapping("/rentar/{ren}/{col}")
    public ResponseEntity<?> renRC(@PathVariable(required = true, name = "ren") int re, @PathVariable(required = true, name = "col") int co){
        return new ResponseEntity<>(tienda.rentarRC(re, co), HttpStatus.OK);
    }

    @PostMapping("/regresar/{ren}/{col}")
    public ResponseEntity<?> regRC(@PathVariable(required = true, name = "ren") int re, @PathVariable(required = true, name = "col") int co){
        return new ResponseEntity<>(tienda.regresarRC(re, co), HttpStatus.OK);
    }

}
