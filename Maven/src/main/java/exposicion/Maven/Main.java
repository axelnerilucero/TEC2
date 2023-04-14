package exposicion.Maven;

public class Main {
    public static void main(String[] args) {
    	Cancion cancion = new Cancion("Las mananitas", "Cepillin", "3:17");
        try{
            CancionArchivo.guardarCancion(cancion, "Mananitas.txt");
            System.out.println("_--------------");
            CancionArchivo.mostrarCancion("Mananitas.txt");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}