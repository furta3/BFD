/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Clases.Clientes;
import Clases.Empleado;
import Clases.Contratacion;
import Clases.Evento;
import Clases.Localidad;
import Clases.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nacho
 */
public class Conexion {
    
    private Conexion() {
    }
    
    public static Conexion getInstance() {
        return ConexionHolder.INSTANCE;
    }
    
    private static class ConexionHolder {
        private static final Conexion INSTANCE = new Conexion();
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BFDPU");
        private static final EntityManager em = emf.createEntityManager();
    }
    
    public EntityManager getEntity(){
        return ConexionHolder.em;
    }
    
    public void persist(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
        public void refresh(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.refresh(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public List<Clientes> listaEspecies() {
        EntityManager em = getEntity();
        List<Clientes> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM persona, Clientes WHERE persona.Id = Clientes.Id ORDER BY nombre ASC", Clientes.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
       public List<Clientes> clienteDetallado() {
        EntityManager em = getEntity();
        List<Clientes> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("select p.nombre, p.apellido, p.telefono, c.dir, c.email from persona as p inner join clientes as c on p.id = c.id", Clientes.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Contratacion> getContrataciones(){
        EntityManager em = getEntity();
        List<Contratacion> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM contratacion", Contratacion.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    

    public List<Evento> getEventos(){
        EntityManager em = getEntity();
        List<Evento> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM evento", Evento.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Localidad> getLocalidades(){
        EntityManager em = getEntity();
        List<Localidad> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM localidad", Localidad.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    

    public List<Clientes> listaEmpleado() {
        EntityManager em = getEntity();
        List<Clientes> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM persona, empleado WHERE persona.Id = empleado.Id ORDER BY nombre ASC", Empleado.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    
    
    public Clientes getCliente(int id){
        EntityManager em = getEntity();
        Clientes s = null;
        em.getTransaction().begin();
        try {
            List<Clientes> lista = null;
            lista = em.createNativeQuery("SELECT * FROM persona WHERE id = " + id, Clientes.class).getResultList();
            em.getTransaction().commit();
            if (!lista.isEmpty()) {
                s = lista.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return s;
    }
    
    public Evento getEvento(String nombre){
        EntityManager em = getEntity();
        Evento ev = null;
        try{
            ev = em.find(Evento.class, nombre);
        }
        catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return ev;
    }
    public Localidad getLocalidad(String nombre){
        EntityManager em = getEntity();
        Localidad loc = null;
        try{
            loc = em.find(Localidad.class, nombre);
        }
        catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return loc;
    }
}
