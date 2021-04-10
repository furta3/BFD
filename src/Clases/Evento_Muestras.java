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
public class Evento_Muestras implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private Evento evento;
    private Muestras muestras;
}
