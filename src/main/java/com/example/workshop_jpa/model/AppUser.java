package com.example.workshop_jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity

public class AppUser {

    @Id

    private int appUserId;
    private String userName;
    private String passWord;
    private LocalDate regDate;

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
