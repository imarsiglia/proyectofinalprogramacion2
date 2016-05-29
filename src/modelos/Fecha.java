/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Fecha {

    private int id;
    private Campeonato campeonato;
    private ArrayList<Encuentro> encuentros;

    public Fecha() {
        this.encuentros = new ArrayList<>();
    }

    public Fecha(int id, Campeonato campeonato) {
        this.id = id;
        this.campeonato = campeonato;
        this.encuentros = new ArrayList<>();
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

    public ArrayList<Encuentro> getEncuentros() {
        return encuentros;
    }
    

}
