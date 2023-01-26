package com.example.workshop_jpa.dao;

import com.example.workshop_jpa.model.AppUser;

import java.util.Collection;
import java.util.Optional;

public interface AppUserDao {

    AppUser persist(AppUser appUser);

    Optional<AppUser> findById(int id);

    Collection<AppUser> findAll();

    AppUser create(AppUser appUser);


    AppUser update(AppUser appUser);


    void remove();
}
