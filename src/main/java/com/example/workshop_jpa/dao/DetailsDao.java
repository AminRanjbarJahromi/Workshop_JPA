package com.example.workshop_jpa.dao;

import com.example.workshop_jpa.model.AppUser;
import com.example.workshop_jpa.model.Details;

import java.util.Collection;
import java.util.Optional;

public interface DetailsDao {

    AppUser persist(Details details);

    Optional<Details> findById(int id);

    Collection<Details> findAll();

    AppUser create(Details details);


    AppUser update(Details details);


    void remove();





}
