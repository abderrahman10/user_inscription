package com.pfe.InscriptionAideFinanciere.api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserInscriptionDto {

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
