package colas;



/**
 *
 * @author user
 */
public class Colas {
    
    private String nombre;
    private int cc;
    private String tipo;
    
    public Colas(String nombre, int cc, String tipo) {
        this.nombre = nombre;
        this.cc = cc;
        this.tipo = tipo;
    }
   
    public Colas() {
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
