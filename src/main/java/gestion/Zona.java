package gestion;
import zooAnimales.*;
import java.util.List;
import java.util.ArrayList;

public class Zona {
    private String nombre;
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
        animal.setZona(this);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre(){
        return nombre;
    }

}
