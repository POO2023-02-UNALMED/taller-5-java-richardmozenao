package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;

public class Animal {
    static int totalAnimales;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;

    }

    public Animal(){

    }

    public static String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        String mensaje = String.format("Mamiferos:%d\n+Aves:%d\nReptiles:%d\nPeces:%d\nAnfibios:%d", Mamifero.cantidadMamiferos(), Ave.cantidadAves(), Reptil.cantidadReptiles(), Pez.cantidadPeces(), Anfibio.cantidadAnfibios());
        return mensaje;
    }

    public String toString(){
        return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, zona.nombre, zona.zoo);
    }
}
