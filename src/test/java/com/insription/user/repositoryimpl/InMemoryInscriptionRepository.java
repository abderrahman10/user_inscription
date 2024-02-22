package com.insription.user.repositoryimpl;

import com.insription.user.core.spi.InscriptionRepository;
import com.insription.user.infrastructure.jpa.model.InscriptionEntity;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class InMemoryInscriptionRepository implements InscriptionRepository {
    private final Set<InscriptionEntity> inscriptionEntities;

    public InMemoryInscriptionRepository() {
        this.inscriptionEntities = new HashSet<>();
        this.inscriptionEntities.add(new InscriptionEntity(1, "email1"));
        this.inscriptionEntities.add(new InscriptionEntity(2,"email2"));
    }

    @Override
    public Optional<InscriptionEntity> findUserInscriptionByGmail(String email) {
        return inscriptionEntities.stream().filter(inscriptionEntity -> inscriptionEntity.getEmail().equals(email)).findFirst();
    }

    @Override
    public void saveM(InscriptionEntity inscriptionEntity) {
        inscriptionEntities.add(inscriptionEntity);
    }
}
