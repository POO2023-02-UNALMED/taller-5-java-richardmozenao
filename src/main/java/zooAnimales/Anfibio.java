package zooAnimales;
import gestion.*;

public class Anfibio extends Animal{
    Anfibio[] listado;
    static int ranas;
    static int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona[] zona, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        
    }

    public Anfibio(){
        
    }

    public static int cantidadAnfibios(){
        totalAnimales += 1;
        return totalAnimales;
    }

    public static String movimiento(){
        return "saltar";
    }

    public static void crearRana(){
        ranas += 1;
    }

    public static void crearSalamandra(){
        salamandras += 1;
    }
}
