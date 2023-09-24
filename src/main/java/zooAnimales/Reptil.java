package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
    public static int totalReptiles;
    public static List<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil(){
        listado.add(this);
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
    
    public String getColorEscamas(){
        return(colorEscamas);
    }

    public int getLargoCola(){
        return largoCola;
    }
}
