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
public class Usuarios {
    private String Nombrecompleto;
    private String usuario;
    private String password;

    public Usuarios() {
    }

    public Usuarios(String Nombrecompleto, String usuario, String password) {
        this.Nombrecompleto = Nombrecompleto;
        this.usuario = usuario;
        this.password = password;
    }

    public String getNombrecompleto() {
        return Nombrecompleto;
    }

    public void setNombrecompleto(String Nombrecompleto) {
        this.Nombrecompleto = Nombrecompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
