package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    List<Zona> zona = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){
        
    }

    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }

    public void cantidadTotalAnimales(){

    }

    
}
