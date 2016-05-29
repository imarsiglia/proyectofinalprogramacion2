
package controladores;

import java.util.ArrayList;
import modelos.Campeonato;
import modelos.Equipo;


public class CampeonatoController {
    
    private static CampeonatoController instance = new CampeonatoController();
    private ArrayList<Campeonato> campeonatos;
    public static int incremente = 1;
    private Campeonato selected;
    
    private CampeonatoController(){
        this.campeonatos = new ArrayList<>();
    }

    public static CampeonatoController getInstance() {
        return instance;
    }
    public void addCampeonato(Campeonato campeonatos){
        this.campeonatos.add(campeonatos);
    }
    public void removeCampeonato(Campeonato campeonatos){
        this.campeonatos.remove(campeonatos);
    }
    public void update (Campeonato campeonatos){
        for(Campeonato c : this.campeonatos){
            if(c.getId()==campeonatos.getId()){
                c.setNombre(campeonatos.getNombre());
                break;
            }
        }
    }

    public ArrayList<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    /**
     * @return the selected
     */
    public Campeonato getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(Campeonato selected) {
        this.selected = selected;
    }
    
    
}
