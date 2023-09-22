package zooAnimales;
import gestion.*;

public class Pez extends Animal{
    static int totalPeces;
    Pez[] listado;
    static int salmones;
    static int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez(){
        
    }

    public static int cantidadPeces(){
        return totalPeces;
    }

    public static String movimiento(){
        return "reptar";
    }

    public static void crearSalmon(){
        salmones += 1;
    }

    public static void crearBacalao(){
        bacalaos += 1;
    }
}
