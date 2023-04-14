package ico.fes.tec.controller;

import ico.fes.tec.model.Automovil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorAutos {

    Logger bitacora;

    ArrayList<Automovil> db;


    public ControladorAutos(){
        bitacora = LoggerFactory.getLogger(this.getClass());
        bitacora.info("Iniciando el controlador");
        db = new ArrayList<>();
        db.add(new Automovil(db.size(), "VW", "POLO", 2019));
        db.add(new Automovil(db.size(), "VW", "GOL", 2013));
        db.add(new Automovil(db.size(), "FORD", "F150", 2015));
    }
    @GetMapping("/autos/api/")
    public ArrayList<Automovil> getAutos(){
        return db;
    }

    @GetMapping("/autos/api/{id}")
    public Automovil getAutoById(@PathVariable(required = true, name = "id") int id){
        return db.get(id);
    }

    @PostMapping("autos/api")
    public Automovil crearAutomovil(@RequestBody Automovil elAuto){
        bitacora.info("Creando el auto :" + elAuto);
        elAuto.setId(db.size());
        db.add(elAuto);
        return elAuto;
    }

}
