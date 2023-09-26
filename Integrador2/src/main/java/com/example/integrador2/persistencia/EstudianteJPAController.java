package com.example.integrador2.persistencia;

import com.example.integrador2.logica.Estudiante;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;


public class EstudianteJPAController implements Serializable {


    public EstudianteJPAController (EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EstudianteJPAController() {
        emf = Persistence.createEntityManagerFactory("unit-2");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudiante estudiante) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}


