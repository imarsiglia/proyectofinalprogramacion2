
package modelos;

public class CampeonatoEquipo {
    
    private int id;
    private Equipo equipo;
    private Campeonato campeonato;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;

    public CampeonatoEquipo() {
    }
    
    public CampeonatoEquipo(int id, Equipo equipo, Campeonato campeonato, int puntos, int golesAFavor, int golesEnContra) {
        this.id = id;
        this.equipo = equipo;
        this.campeonato = campeonato;
        this.puntos = puntos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
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
     * @return the campeonato
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * @param campeonato the campeonato to set
     */
    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the golesAFavor
     */
    public int getGolesAFavor() {
        return golesAFavor;
    }

    /**
     * @param golesAFavor the golesAFavor to set
     */
    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    /**
     * @return the golesEnContra
     */
    public int getGolesEnContra() {
        return golesEnContra;
    }

    /**
     * @param golesEnContra the golesEnContra to set
     */
    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }
    
    /**
     * Reset params
     */
    public void reset(){
        this.puntos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }
    
    
}
