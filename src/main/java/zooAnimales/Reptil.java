package zooAnimales;

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

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas += 1;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes += 1;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
    
    
}
