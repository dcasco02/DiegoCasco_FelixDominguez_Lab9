/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_felixdominguez_lab9;

/**
 *
 * @author dcasc
 */
public class Maestro {
    private String nombre;
    private int numeroRRHH;

    public Maestro() {
    }

    public Maestro(String nombre, int numeroRRHH) {
        this.nombre = nombre;
        this.numeroRRHH = numeroRRHH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroRRHH() {
        return numeroRRHH;
    }

    public void setNumeroRRHH(int numeroRRHH) {
        this.numeroRRHH = numeroRRHH;
    }
    
    
}
