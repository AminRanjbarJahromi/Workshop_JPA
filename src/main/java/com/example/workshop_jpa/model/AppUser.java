package com.example.workshop_jpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int appUserId;

    @Column(nullable = false , unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    private LocalDate regDate;

    public AppUser() {

        this.regDate = LocalDate.now();
    }

    @OneToOne
    @JoinColumn(name = "details_details_id")
    private Details details;

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }


}
