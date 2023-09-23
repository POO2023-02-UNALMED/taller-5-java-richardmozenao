package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    String nombre;
    String ubicacion;
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

    public int cantidadTotalAnimales(){
        int c = 0;
        for(int i = 0; i<zona.size();i++){
            c += zona.get(i).cantidadAnimales();
        }
        return c;
    }
}
