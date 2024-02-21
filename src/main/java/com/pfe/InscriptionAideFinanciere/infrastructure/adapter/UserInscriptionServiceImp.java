package com.pfe.InscriptionAideFinanciere.infrastructure.adapter;

import com.pfe.InscriptionAideFinanciere.core.UserInscription;
import com.pfe.InscriptionAideFinanciere.core.api.UserInscriptionService;
import com.pfe.InscriptionAideFinanciere.core.spi.UserInscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserInscriptionServiceImp implements UserInscriptionService {

    private  final UserInscriptionRepository userInscriptionRepository;


    @Override
    public UserInscription CreateUserInscription(UserInscription userInscription) {

        return userInscriptionRepository.saveUserInscription(userInscription);
    }
}
