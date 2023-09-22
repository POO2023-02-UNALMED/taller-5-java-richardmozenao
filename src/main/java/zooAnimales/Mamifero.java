package zooAnimales;

public class Mamifero extends Animal{
    static int totalMamiferos;
    static Mamifero[] mamiferos;
    static int caballos;
    static int leones;
    boolean pelaje;
    int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public Mamifero(){

    }

    public static int cantidadMamiferos(){
        return totalAnimales;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos += 1;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);

    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones += 1;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
}
