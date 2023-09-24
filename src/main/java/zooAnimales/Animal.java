package zooAnimales;
import gestion.Zona;


public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;
    }

    public Animal(){
        totalAnimales += 1;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        String mensaje = String.format("Mamiferos:%d\n+Aves:%d\nReptiles:%d\nPeces:%d\nAnfibios:%d", Mamifero.cantidadMamiferos(), Ave.cantidadAves(), Reptil.cantidadReptiles(), Pez.cantidadPeces(), Anfibio.cantidadAnfibios());
        return mensaje;
    }

    public String toString(){
        return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, zona.getNombre(), zona.getZoo());
    }

    public int getTotalAnimales(){
        return totalAnimales;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getHabitat(){
        return habitat;
    }

    public String getGenero(){
        return genero;
    }

    public Zona getZona(){
        return zona;
    }

    public void setZona(Zona zona){
        this.zona = zona;
    }
}
