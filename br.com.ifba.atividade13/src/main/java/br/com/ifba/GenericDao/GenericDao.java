/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.GenericDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
/**
 *
 * @author inaci
 */
public abstract class GenericDao<T>
        implements GenericIDao<T> {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("desafio");

    protected EntityManager entityManager;

    private Class<T> entityClass;

    public GenericDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager getEntityManager() {

        if (entityManager == null ||
            !entityManager.isOpen()) {

            entityManager = emf.createEntityManager();
        }

        return entityManager;
    }

    @Override
    public void salvar(T entity) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        em.persist(entity);

        em.getTransaction().commit();
    }

    @Override
    public void atualizar(T entity) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        em.merge(entity);

        em.getTransaction().commit();
    }

    @Override
    public void deletar(Long id) {

        EntityManager em = getEntityManager();

        T entity = em.find(entityClass, id);

        em.getTransaction().begin();

        em.remove(entity);

        em.getTransaction().commit();
    }

    @Override
    public T buscarPorId(Long id) {

        EntityManager em = getEntityManager();

        return em.find(entityClass, id);
    }

    @Override
    public List<T> listarTodos() {

        EntityManager em = getEntityManager();

        return em.createQuery(
                "FROM " + entityClass.getSimpleName(),
                entityClass
        ).getResultList();
    }
}