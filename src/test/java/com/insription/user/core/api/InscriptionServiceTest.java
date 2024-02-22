package com.insription.user.core.api;

import com.insription.user.core.InscriptionException;
import com.insription.user.core.UserInscription;
import com.insription.user.core.impl.InscriptionServiceImpl;
import com.insription.user.repositoryimpl.InMemoryInscriptionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class InscriptionServiceTest {

    InscriptionService inscriptionService;

    @BeforeEach
    void setUp() {
        inscriptionService = new InscriptionServiceImpl(new InMemoryInscriptionRepository());
    }
    @Test
    void createInscription_Ok() {
        UserInscription userInscription = new UserInscription("Anas","ZAHOURI","06666666","email3", LocalDateTime.now());
        boolean isInscrit = inscriptionService.inscrireUtilisateur(userInscription);
        assertTrue(isInscrit);
    }

    @Test
    void createInscription_NOk() {
        UserInscription userInscription = new UserInscription("Anas","ZAHOURI","06666666","email1", LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
        assertThrows(InscriptionException.class, () -> inscriptionService.inscrireUtilisateur(userInscription));
    }

}