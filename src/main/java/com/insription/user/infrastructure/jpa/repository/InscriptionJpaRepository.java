package com.insription.user.infrastructure.jpa.repository;

import com.insription.user.core.spi.InscriptionRepository;
import com.insription.user.infrastructure.jpa.model.InscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionJpaRepository extends JpaRepository<InscriptionEntity, Long>, InscriptionRepository {
}
