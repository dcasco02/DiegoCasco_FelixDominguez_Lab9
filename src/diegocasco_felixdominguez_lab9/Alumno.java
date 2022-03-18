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
public class Alumno {
    private String nombre;
    private int numerocuenta;
    private String carrera;
    ArrayList <Clase> clases = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, int numerocuenta, String carrera) {
        this.nombre = nombre;
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    
}
