package com.insription.user.core.impl;

import com.insription.user.core.InscriptionException;
import com.insription.user.core.UserInscription;
import com.insription.user.core.api.InscriptionService;
import com.insription.user.core.spi.InscriptionRepository;
import com.insription.user.infrastructure.jpa.model.InscriptionEntity;

import java.util.Optional;

public class InscriptionServiceImpl implements InscriptionService {
    private final InscriptionRepository inscriptionRepository;

    public InscriptionServiceImpl(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    @Override
    public boolean inscrireUtilisateur(UserInscription userInscription) {
        Optional<InscriptionEntity> inscriptionEntityOptional = inscriptionRepository.findUserInscriptionByGmail(userInscription.getEmail());
        inscriptionEntityOptional.ifPresentOrElse(inscriptionEntity -> {
            throw new InscriptionException("email already used");
        }, () -> {
            inscriptionRepository.saveM(new InscriptionEntity(1l, userInscription.getEmail()));
        });
        return true;
    }

    @Override
    public UserInscription findUserInscriptionById(int i) {
        return null;
    }
}
