
package controladores;

import java.util.ArrayList;
import modelos.Persona;


public class PersonaController {
    
    private static PersonaController instance = new PersonaController();
    private ArrayList<Persona> personas;
    public static int incremente = 1;
    
    private PersonaController(){
        this.personas = new ArrayList<>();
    }

    public static PersonaController getInstance() {
        return instance;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    public void addPersonas(Persona personas){
        this.personas.add(personas);
    }
    public void removePersonas(Persona personas){
        this.personas.remove(personas);
    }
    public void updatePersonas(Persona personas){
        for(Persona p : this.personas){
            if(p.getId()==personas.getId()){
                p.setNombre(personas.getNombre());
                break;
            }
        }
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
}
