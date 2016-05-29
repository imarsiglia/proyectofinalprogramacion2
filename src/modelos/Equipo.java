
package modelos;

import java.util.ArrayList;


public class Equipo {
    
    private int id;
    private String nombre;
    private ArrayList<Persona> persona;
    private ArrayList<CampeonatoEquipo> campeonatos;

    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.persona = new ArrayList<>();
        this.campeonatos = new ArrayList<>();
        
    }

    public Equipo() {
        this.persona = new ArrayList<>();
        this.campeonatos = new ArrayList<>();
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public ArrayList<CampeonatoEquipo> getCampeonatos() {
        return campeonatos;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }
    
    
}
