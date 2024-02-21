package com.pfe.InscriptionAideFinanciere.infrastructure.repository;

import com.pfe.InscriptionAideFinanciere.infrastructure.entity.UserInscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<UserInscriptionEntity,Long> {
}
