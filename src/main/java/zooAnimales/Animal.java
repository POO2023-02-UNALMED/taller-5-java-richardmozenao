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
        String mensaje = String.format("Mamiferos: %d\n"+
        "Aves: %d\n"+
        "Reptiles: %d\n"+
        "Peces: %d\n"+
        "Anfibios: %d", Mamifero.cantidadMamiferos(), Ave.cantidadAves(), Reptil.cantidadReptiles(), Pez.cantidadPeces(), Anfibio.cantidadAnfibios());
        return mensaje;
    }

    public String toString(){
        String mensaje1 = String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s", nombre, edad, habitat, genero);
        String mensaje2 = "";
        if(zona != null){
            mensaje2 = String.format(", la zona en la que me ubico es %s, en el %s", zona.getNombre(), zona.getZoo().getNombre());
        }
        return mensaje1 + mensaje2;
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
