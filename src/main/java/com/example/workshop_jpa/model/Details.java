package com.example.workshop_jpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int detailsId;

    @Column(nullable = false, length = 150, unique = true)
    private String email;
    private String name;
    private LocalDate birthDate;

}
