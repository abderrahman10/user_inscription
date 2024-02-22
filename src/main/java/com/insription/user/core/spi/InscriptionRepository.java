package com.insription.user.core.spi;

import com.insription.user.infrastructure.jpa.model.InscriptionEntity;

import java.util.Optional;

public interface InscriptionRepository {
    Optional<InscriptionEntity> findUserInscriptionByGmail(String email);

    void saveM(InscriptionEntity inscriptionEntity);
}
