package com.example.workshop_jpa.dao;


import com.example.workshop_jpa.model.AppUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public class AppUserDaoImpl implements AppUserDao {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public AppUser persist(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    @Transactional
    public Optional<AppUser> findById(int id) {
       return Optional.ofNullable(entityManager.find(AppUser.class,id));

    }

    @Override
    @Transactional(readOnly = true)
    public Collection<AppUser> findAll() {
        return entityManager.
                createQuery(" select a from AppUser a",AppUser.class).
                getResultList();

    }

    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    @Transactional
    public AppUser update(AppUser appUser) {
         entityManager.merge(appUser);
         return appUser;

    }

    @Override
    @Transactional
    public void delete(int appUserId) {
        entityManager.remove(entityManager.find(AppUser.class,appUserId));

    }


}
