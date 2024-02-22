package com.insription.user.infrastructure.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InscriptionEntity {
    private long id;
    private String email;
}
