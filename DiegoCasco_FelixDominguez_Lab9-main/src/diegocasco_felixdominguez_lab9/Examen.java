/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_felixdominguez_lab9;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Examen {
    private String IDExamen;
    private int numpre;
    private Clase clase;
    private ArrayList<Pregunta> preguntas;

    public Examen() {
    }

    public Examen(String IDExamen, int numpre, Clase clase) {
        this.IDExamen = IDExamen;
        this.numpre = numpre;
        this.clase = clase;
    }
    
    public Examen(String IDExamen, Clase clase, ArrayList<Pregunta> preguntas) {
        this.IDExamen = IDExamen;
        this.clase = clase;
        this.preguntas = preguntas;
    }

    public String getIDExamen() {
        return IDExamen;
    }

    public void setIDExamen(String IDExamen) {
        this.IDExamen = IDExamen;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public int getNumpre() {
        return numpre;
    }

    public void setNumpre(int numpre) {
        this.numpre = numpre;
    }

    @Override
    public String toString() {
        return "IDExamen=" + IDExamen + ", clase=" + clase + ", preguntas=" + preguntas;
    }
    
    
}
