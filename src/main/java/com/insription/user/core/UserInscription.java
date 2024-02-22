package com.insription.user.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
