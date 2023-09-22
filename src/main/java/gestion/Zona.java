package gestion;
import zooAnimales.*;

public class Zona {
    String nombre;
    Zoologico zoo;
    Animal[] animales;

    public Zona(String nombre, Zoologico zoo, Animal[] animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }

    public Zona(){

    }

    public void agregarAnimales(){

    }

    public int cantidadAnimales(){
        return animales.length;
    }

}
