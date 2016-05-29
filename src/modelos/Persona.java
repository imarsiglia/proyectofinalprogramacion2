
package modelos;

import java.util.ArrayList;


public class Persona {
    private int id;
    private Equipo equipo;
    private String nombre;
    private String apellido;
    private ArrayList<Gol> goles;

    public Persona() {
        this.goles = new ArrayList<>();
    }

    public Persona(int id, Equipo equipo, String nombre, String apellido) {
        this.id = id;
        this.equipo = equipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.goles = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the equipo
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
