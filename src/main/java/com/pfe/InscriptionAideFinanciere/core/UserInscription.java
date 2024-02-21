package com.pfe.InscriptionAideFinanciere.core;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserInscription {
    Long id;
    String firstName;
    String  lastName;
    String  email;
    Long phone;
    String  token;
    String  civility;
    String status;
    String dcrName;
    String dcrDepartement;
}
