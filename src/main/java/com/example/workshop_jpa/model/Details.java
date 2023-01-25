package com.example.workshop_jpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int detailsId;
    private String email;
    private String name;
    private LocalDate birthDate;

}
