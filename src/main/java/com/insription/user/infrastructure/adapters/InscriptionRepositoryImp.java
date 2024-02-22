package com.insription.user.infrastructure.adapters;

import com.insription.user.core.UserInscription;
import com.insription.user.core.spi.InscriptionRepository;
import com.insription.user.infrastructure.mapper.UserInscriptionEntityMapper;
import com.insription.user.infrastructure.repository.InscriptionSpringDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InscriptionRepositoryImp implements InscriptionRepository {

private  final InscriptionSpringDataRepository inscriptionSpringDataRepository;
private  final UserInscriptionEntityMapper userInscriptionMapper;
    @Override
    public UserInscription saveInscription(UserInscription userInscription) {
        return  userInscriptionMapper.
                toDomain(inscriptionSpringDataRepository
                        .save(userInscriptionMapper.toEntity(userInscription)));
    }
}
