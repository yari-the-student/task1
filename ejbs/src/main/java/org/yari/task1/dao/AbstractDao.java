package org.yari.task1.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
 
public abstract class AbstractDao<T> {
 
    protected abstract EntityManager getEntityManager();
 
    private Class<T> entityClass;
 
    public Class<T> getEntityClass() {
        return entityClass;
    }
 
    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
 
    public void persist(T entity) {
        getEntityManager().persist(entity);
    }
 
    public void remove(T entity) {
        if (entity != null) {
            getEntityManager().remove(entity);
        }
    }
 
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public TypedQuery<T> namedQuery(String queryName) {
        return getEntityManager().createNamedQuery(queryName, entityClass);
    }
 
    public TypedQuery<T> query(String queryString) {
        return getEntityManager().createQuery(queryString, entityClass);
    }
}
