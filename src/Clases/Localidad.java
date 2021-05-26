/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Buri
 */
@Entity
public class Localidad implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    private String nombre;
    @OneToMany(mappedBy = "localidad")
    private List<Trabajo> trabajos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Localidad(String nombre) {
        this.nombre = nombre;
    }
    public Localidad(){}
}
