/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Empleado extends Persona implements Serializable {
    
    @ManyToMany(mappedBy = "trabaja")
    private Trabajo[] trabajos;
    
}