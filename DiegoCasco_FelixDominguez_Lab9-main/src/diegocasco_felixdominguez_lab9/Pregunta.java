/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_felixdominguez_lab9;

/**
 *
 * @author Lenovo I7
 */
public class Pregunta {
    private String pregunta;
    private Boolean respuesta;
    private Examen examen;

    public Pregunta() {
    }

    public Pregunta(String pregunta, Boolean respuesta, Examen examen) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.examen = examen;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    @Override
    public String toString() {
        return "pregunta=" + pregunta + ", respuesta=" + respuesta + ", clase=" + examen;
    }
    
    
}
