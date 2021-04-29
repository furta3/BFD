/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Clientes extends Persona implements Serializable {

    private String email;
    private String dir;
    
    @OneToMany(mappedBy = "cliente")
    private List<Contratacion>  contrataciones;

    /*public Cliente(String email, String dir, String nombre, String apellido, String telefono, List<Contratacion> contra) {
        super(nombre, apellido, telefono);
        this.email = email;
        this.dir = dir;
        this.contrataciones = contra;
    }*/

    public List<Contratacion> getContrataciones() {
        return contrataciones;
    }

    public void setContrataciones(List<Contratacion> contrataciones) {
        this.contrataciones = contrataciones;
    }
    
    public Clientes(){}
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
