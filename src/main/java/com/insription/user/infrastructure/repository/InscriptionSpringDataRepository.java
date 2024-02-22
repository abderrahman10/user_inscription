package com.insription.user.infrastructure.repository;

import com.insription.user.infrastructure.entity.UserInscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionSpringDataRepository extends JpaRepository<UserInscriptionEntity,Long> {
}
