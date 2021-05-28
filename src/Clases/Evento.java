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
import javax.persistence.OneToMany;


/**
 *
 * @author Buri
 */
@Entity
public class Evento implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    private String nombre;
    
    @OneToMany(mappedBy = "evento")
    private List<Trabajo> trabajos;
    @ManyToMany(mappedBy = "Eventos")
    private List<Muestras> muestras_evento;
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

    public List<Muestras> getMuestras_evento() {
        return muestras_evento;
    }

    public void setMuestras_evento(List<Muestras> muestras_evento) {
        this.muestras_evento = muestras_evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Evento(String nombre,boolean vigente) {
        this.nombre = nombre;
        this.vigente = vigente;
    }
    public Evento(String nombre){
        this.nombre=nombre;
    }
    public Evento(){}
    
    @Override
    public String toString() {
        return nombre;
    }
}
