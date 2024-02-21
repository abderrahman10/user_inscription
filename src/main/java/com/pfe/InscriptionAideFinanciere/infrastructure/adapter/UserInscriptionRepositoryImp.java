package com.pfe.InscriptionAideFinanciere.infrastructure.adapter;

import com.pfe.InscriptionAideFinanciere.core.UserInscription;
import com.pfe.InscriptionAideFinanciere.core.spi.UserInscriptionRepository;
import com.pfe.InscriptionAideFinanciere.infrastructure.entity.UserInscriptionEntity;
import com.pfe.InscriptionAideFinanciere.infrastructure.mapper.UserInscriptionMapper;
import com.pfe.InscriptionAideFinanciere.infrastructure.repository.InscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserInscriptionRepositoryImp implements UserInscriptionRepository {
    private  final  InscriptionRepository inscriptionRepository;
    private  final UserInscriptionMapper userInscriptionMapper;


    @Override
    public UserInscription saveUserInscription(UserInscription userInscription) {

        UserInscriptionEntity userInscriptionEntity =userInscriptionMapper.toUserInscriptionEntity(userInscription);
        userInscriptionEntity=inscriptionRepository.save(userInscriptionEntity);
        return  userInscriptionMapper.toUserInscription(userInscriptionEntity);


    }
}
