package zooAnimales;

public class Ave extends Animal{
    static int totalAves;
    Ave[] listado;
    static int halcones;
    static int aguilas;
    String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }
    public Ave(){
        
    }

    public static int cantidadAves(){
        return totalAves;
    }

    public static String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");

    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas += 1;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
}
