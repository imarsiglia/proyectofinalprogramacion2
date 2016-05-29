
package controladores;

import java.util.ArrayList;
import modelos.Equipo;


public class EquipoController {
    
    private static EquipoController instance = new EquipoController();
    private ArrayList<Equipo> equipos;
    public static int incremente = 1;
    private Equipo selected;
    
    private EquipoController(){
        this.equipos = new ArrayList<>();
    }

    public static EquipoController getInstance() {
        return instance;
    }
    
    public void addEquipo(Equipo equipos){
        this.equipos.add(equipos);
    }
    public void removeEquipo(Equipo equipos){
        this.equipos.remove(equipos);
    }
    
    public void updateEquipo(Equipo equipos){
        
        for(Equipo e : this.equipos){
            if(e.getId()==equipos.getId()){
                e.setNombre(equipos.getNombre());
                break;
            }
        }
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public Equipo getSelected() {
        return selected;
    }

    public void setSelected(Equipo selected) {
        this.selected = selected;
    }
    
    
}
