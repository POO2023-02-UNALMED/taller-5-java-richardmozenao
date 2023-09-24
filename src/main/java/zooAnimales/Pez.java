package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
    public static int totalPeces;
    public static List<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(){
        listado.add(this);
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones += 1;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos += 1;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

    public String getColorEscamas(){
        return colorEscamas;
    }

    public int getCantidadAletas(){
        return cantidadAletas;
    }
}
