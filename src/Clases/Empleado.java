/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Empleado extends Persona implements Serializable {
    

    @OneToMany(mappedBy = "empleado")
    private List<Trabaja> trabajos;

    public List<Trabaja> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(List<Trabaja> trabajos) {
        this.trabajos = trabajos;
    }

}