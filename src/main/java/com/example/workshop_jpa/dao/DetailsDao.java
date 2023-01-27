package com.example.workshop_jpa.dao;

import com.example.workshop_jpa.model.AppUser;
import com.example.workshop_jpa.model.Details;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface DetailsDao {

    Details persist(Details details);

    Details findById(int detailsId);

    Collection<Details> findAll();

    Details create(Details details);



    Details update(Details details);


    void delete(int detailsId);
}
