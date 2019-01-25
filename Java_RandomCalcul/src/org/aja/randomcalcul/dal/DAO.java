package org.aja.randomcalcul.dal;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;

import javax.persistence.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public class DAO<T, ID> implements IDAO<T, ID> {

    private static final String P_UNIT = "scorecalcul";
    EntityManagerFactory emf;
    private Class<T> type;

    public DAO(Class<T> type) {
        emf = Persistence.createEntityManagerFactory(P_UNIT);
        this.type = type;
    }

    @Override
    public void create(T object) throws SQLException {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(T object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        object = em.merge(object);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Set<T> findAll() throws SQLException {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("from" + type.getSimpleName());
        //TypedQuery query = em.createQuery("from" + type.getSimpleName(), type);
        Set<T> set = (Set<T>) query.getResultList();
        return set;
    }

    @Override
    public T findById(ID id) {
        EntityManager em = emf.createEntityManager();
        T entity = em.find(type , id);
        return entity;
    }
}
