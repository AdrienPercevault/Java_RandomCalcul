package org.aja.randomcalcul.dal;

import javax.persistence.*;
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
    public void create(T object) {
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
        em.merge(object);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Set<T> findAll() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("from" + type.getSimpleName());
        // TypedQuery query = em.createQuery("from" + type.getSimpleName(), type);
        Set<T> set = (Set<T>) query.getResultList();
        return set;
    }

    @Override
    public T findById(ID id) {
        EntityManager em = emf.createEntityManager();
        T entity = em.find(type , id);
        return entity;
    }

    @Override
    public Set<T> getScore() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT number FROM Account a ORDER BY a.number DESC");
        Set<T> set = (Set<T>) query.getResultList();
        return set;
    }
}
