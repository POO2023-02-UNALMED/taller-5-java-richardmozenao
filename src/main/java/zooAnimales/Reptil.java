package zooAnimales;
import gestion.*;

public class Reptil extends Animal{
    static int totalReptiles;
    Reptil[] listado;
    static int iguanas;
    static int serpientes;
    String colorEscamas;
    int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        
    }
    public Reptil(){
        
    }

    public static int cantidadReptiles(){
        return totalReptiles;
    }

    public static String movimiento(){
        return "reptar";
    }

    public static void crearIguana(){
        iguanas += 1;
    }

    public static void crearSerpiente(){
        serpientes += 1;
    }
    
    
}
