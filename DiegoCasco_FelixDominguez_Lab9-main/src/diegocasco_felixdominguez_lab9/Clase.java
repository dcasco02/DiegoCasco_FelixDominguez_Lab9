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
public class Clase {
    private String nombre;
    private int id;
    private int idmaestro;
    private int idExamenI;
    private int idEXamenII;

    public Clase() {
    }

    public Clase(String nombre, int id, int idmaestro, int idExamenI, int idEXamenII) {
        this.nombre = nombre;
        this.id = id;
        this.idmaestro = idmaestro;
        this.idExamenI = idExamenI;
        this.idEXamenII = idEXamenII;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmaestro() {
        return idmaestro;
    }

    public void setIdmaestro(int idmaestro) {
        this.idmaestro = idmaestro;
    }

    public int getIdExamenI() {
        return idExamenI;
    }

    public void setIdExamenI(int idExamenI) {
        this.idExamenI = idExamenI;
    }

    public int getIdEXamenII() {
        return idEXamenII;
    }

    public void setIdEXamenII(int idEXamenII) {
        this.idEXamenII = idEXamenII;
    }
    
    
}
