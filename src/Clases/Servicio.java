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

/**
 *
 * @author Buri
 */
@Entity
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String tipo;

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