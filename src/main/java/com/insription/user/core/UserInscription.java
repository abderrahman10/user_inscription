package com.insription.user.core;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInscription {
    private String nom;
    private String prenom;
    private String email;
    private String numeroTelephone;
    private LocalDateTime dateInscription;

    public UserInscription(String nom, String prenom, String numeroTelephone, String gmail, LocalDateTime dateInscription) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.email = gmail;
        this.dateInscription = dateInscription;
    }

}
