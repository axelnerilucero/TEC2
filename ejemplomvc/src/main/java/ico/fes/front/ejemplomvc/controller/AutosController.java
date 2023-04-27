package ico.fes.front.ejemplomvc.controller;


import ico.fes.front.ejemplomvc.model.Automovil;
import ico.fes.front.ejemplomvc.model.Catalogo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AutosController {

    @GetMapping("/auto/")
    public String getAuto(Model model){
        Automovil auto = new Automovil(1, "Volks Wagen", "Vento", 2020, "es un sedan compacto de alta calidad fabricado por la marca alemana Volkswagen. Es conocido por su estilo elegante y deportivo, y es muy popular en el mercado de automoviles indio", "https://fusible.info/wp-content/uploads/2022/02/Volkswagen-Vento-Jetta-2012-2015_2013_fusibles.png");
        model.addAttribute("auto", auto);

        return "index";
    }

    @GetMapping("/autos/")
    public String getAllAutos(Model model){
        ArrayList<Automovil> autos = Catalogo.obtenerAutos();
        model.addAttribute("autos", autos);
        return "catalogo";
    }
}
