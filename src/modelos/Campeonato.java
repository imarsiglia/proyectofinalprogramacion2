package modelos;

import controladores.CampeonatoController;
import java.util.ArrayList;

public class Campeonato {

    private int id;
    private String nombre;
    private ArrayList<Fecha> fecha;
    private ArrayList<CampeonatoEquipo> equipos;

    public Campeonato() {
        this.fecha = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public Campeonato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public void crearFechas() {

        for (CampeonatoEquipo campeonatoEquipoLocal : getEquipos()) {
            Fecha fecha = new Fecha(CampeonatoController.incremente++, this);
            for (CampeonatoEquipo campeonatoEquipoVisiante : getEquipos()) {
                if (campeonatoEquipoLocal != campeonatoEquipoVisiante) {
                    Encuentro encuentro = new Encuentro(CampeonatoController.incremente++, campeonatoEquipoLocal.getEquipo(), campeonatoEquipoVisiante.getEquipo(), fecha);
                    fecha.getEncuentros().add(encuentro);
                }
            }
            this.getFecha().add(fecha);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
     * @return the fecha
     */
    public ArrayList<Fecha> getFecha() {
        return fecha;
    }

    /**
     * @return the equipos
     */
    public ArrayList<CampeonatoEquipo> getEquipos() {
        return equipos;
    }

    public boolean isEquipo(int id) {
        for (CampeonatoEquipo campeonatoEquipo : getEquipos()) {
            if (campeonatoEquipo.getEquipo().getId() == id) {
                return true;
            }
        }
        return false;
    }

}
