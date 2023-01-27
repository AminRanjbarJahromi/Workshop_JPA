package com.example.workshop_jpa.dao;


import com.example.workshop_jpa.model.Details;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;

@Repository
public class DetailsDaoImpl implements DetailsDao {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public Details persist(Details details) {
        entityManager.persist(details);
        return details;
    }

    @Override
    @Transactional
    public Details findById(int detailsId) {
        return entityManager.find(Details.class,detailsId);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Details> findAll() {
        return entityManager.
                createQuery("select d from Details d",Details.class).
                getResultList();
    }

    @Override
    @Transactional
    public Details create(Details details) {
        entityManager.persist(details);
        return details;
    }

    @Override
    @Transactional
    public Details update(Details details) {
        entityManager.merge(details);
        return details;
    }

    @Override
    @Transactional
    public void delete(int detailsId) {
        entityManager.remove(entityManager.find(Details.class,detailsId));

    }
}
