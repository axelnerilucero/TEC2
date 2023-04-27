package ico.fes.front.ejemplomvc.model;

import java.util.ArrayList;

public class Catalogo {
    private static ArrayList<Automovil> autos;

    public Catalogo(ArrayList<Automovil> autos) {
        this.autos = autos;
    }

    public ArrayList<Automovil> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Automovil> autos) {
        this.autos = autos;
    }
    public Catalogo() {

    }

    public static ArrayList<Automovil> obtenerAutos(){
        autos = new ArrayList<Automovil>();
        autos.add(new Automovil(1, "Volks Wagen", "Vento", 2020, "es un sedan compacto de alta calidad fabricado por la marca alemana Volkswagen. Es conocido por su estilo elegante y deportivo, y es muy popular en el mercado de autos indio", "https://fusible.info/wp-content/uploads/2022/02/Volkswagen-Vento-Jetta-2012-2015_2013_fusibles.png"));
        autos.add(new Automovil(2, "Honda", "City", 2021, "sedan compacto japones de alta calidad fabricado por Honda. Es conocido por su eficiencia de combustible, su rendimiento suave y su manejo comodo. Es un auto muy popular en Asia y otros mercados mundiales.", "https://www.hondadiana.com.mx/static/agency-go-virtual/Honda/Modelos/honda-city.png"));
        autos.add(new Automovil(3, "Toyota", "Yaris", 2023, "subcompacto japones de alta calidad fabricado por Toyota. Es conocido por su fiabilidad, seguridad y eficiencia de combustible. Muy popular en el mercado de autos europeo y asiatico.", "https://cdn.deagenciapa.com/wp-content/uploads/2020/11/Toyota-Yaris-GR-2021-deagenciapa.com-026-300x200.jpg"));
        autos.add(new Automovil(4, "Mazda", "Tres", 2019, "compacto de alta calidad fabricado por la marca japonesa Mazda. Es conocido por su estilo deportivo y su manejo dinamico. Es muy popular en el mercado de autos estadounidense y europeo.", "https://static.retail.autofact.cl/blog/c_img_300x200.5dvxe81k70nz6wf.jpg"));
        autos.add(new Automovil(5, "Ford", "Fiesta", 2023, "subcompacto de alta calidad fabricado por la marca estadounidense Ford. Es conocido por su eficiencia de combustible, su manejo agil y su interior espacioso. Es muy popular en el mercado de autos europeo y latinoamericano.", "https://s10.s3c.es/imag/_v2/ecodiario/motor/300x200/ford-fiesta-sport-02.jpg"));

        return autos;
    }
}
