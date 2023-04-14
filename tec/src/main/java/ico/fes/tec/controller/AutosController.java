package ico.fes.tec.controller;

import ico.fes.tec.model.Automovil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AutosController {
    Logger bitacora;

    ArrayList<Automovil> db;

    public AutosController() {
        bitacora = LoggerFactory.getLogger(this.getClass());
        bitacora.info("Iniciando el controlador");
        db = new ArrayList<>();
        db.add(new Automovil(db.size(), "VW", "POLO", 2019));
        db.add(new Automovil(db.size(), "VW", "GOL", 2013));
        db.add(new Automovil(db.size(), "FORD", "F150", 2015));
    }

    @GetMapping("/autos/apiv2")
    public ResponseEntity<ArrayList<Automovil>> regresarTodos() {
        return new ResponseEntity<>(db, HttpStatus.OK);
    }

    @GetMapping("/autos/apiv2/{id}")
    public ResponseEntity<Automovil> regresarAutoById(@PathVariable(required = true, name = "id") int id){
        return new ResponseEntity<>(db.get(id), HttpStatus.OK);
    }
}