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
import javax.persistence.ManyToMany;

/**
 *
 * @author Buri
 */
@Entity
public class Servicio implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    private String tipo;
    
    @ManyToMany
    private List<Trabajo> trabajos;
    private boolean vigente;

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(List<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }

    public Servicio(String tipo) {
        this.tipo = tipo;
    }
    
    public Servicio(){}
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
