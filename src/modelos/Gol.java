
package modelos;


public class Gol {
    
    private int id;
    private Encuentro encuentro;
    private Persona persona;

    public Gol() {
    }

    public Gol(int id, Encuentro encuentro, Persona persona) {
        this.id = id;
        this.encuentro = encuentro;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Encuentro getEncuentro() {
        return encuentro;
    }

    
    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    
    public Persona getPersona() {
        return persona;
    }

    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
