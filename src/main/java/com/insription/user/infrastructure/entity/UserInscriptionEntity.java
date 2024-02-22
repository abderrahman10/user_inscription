package com.insription.user.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class UserInscriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

