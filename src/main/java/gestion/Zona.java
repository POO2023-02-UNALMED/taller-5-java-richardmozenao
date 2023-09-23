package gestion;
import zooAnimales.*;
import java.util.List;
import java.util.ArrayList;

public class Zona {
    public String nombre;
    public Zoologico zoo;
    List<Animal> animales = new ArrayList<Animal>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){

    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

}
