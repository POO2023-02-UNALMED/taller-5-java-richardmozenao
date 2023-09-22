package zooAnimales;
import gestion.*;

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

    public static void crearHalcon(){
        halcones += 1;
    }

    public static void crearAguila(){
        aguilas += 1;
    }
}
