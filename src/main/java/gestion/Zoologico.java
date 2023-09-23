package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zona = new ArrayList<Zona>();

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

    public List<Zona> getZona(){
        return this.zona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

}
