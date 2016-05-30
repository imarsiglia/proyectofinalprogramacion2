
package modelos;

import java.util.ArrayList;


public class Encuentro {
    
    private int id;
    private Equipo local;
    private Equipo visitante;
    private Fecha fecha;
    private ArrayList<Gol> golesLocal;
    private ArrayList<Gol> golesVisitante;
    private boolean jugado;

    public Encuentro() {
        this.golesLocal = new ArrayList<>();
        this.golesVisitante = new ArrayList<>();
                
    }

    public Encuentro(int id, Equipo local, Equipo visitante, Fecha fecha, boolean jugado) {
        this.id = id;
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesLocal = new ArrayList<>();
        this.golesVisitante = new ArrayList<>();
        this.jugado = jugado;
    }

    /**
     * @return the golesLocal
     */
    public ArrayList<Gol> getGolesLocal() {
        return golesLocal;
    }

    /**
     * @return the golesVisitante
     */
    public ArrayList<Gol> getGolesVisitante() {
        return golesVisitante;
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
     * @return the local
     */
    public Equipo getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(Equipo local) {
        this.local = local;
    }

    /**
     * @return the visitante
     */
    public Equipo getVisitante() {
        return visitante;
    }

    /**
     * @param visitante the visitante to set
     */
    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * 
     * @return the object in string
     */
    @Override
    public String toString() {
        return id + " " + local.getNombre() +  " " + visitante.getNombre() + " GL: " + 
                this.golesLocal.size() + " GV: " + this.golesVisitante.size();
    }

    /**
     * @return the jugado
     */
    public boolean isJugado() {
        return jugado;
    }

    /**
     * @param jugado the jugado to set
     */
    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
    
}