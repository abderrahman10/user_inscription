package com.insription.user.infrastructure.adapters;

import com.insription.user.core.UserInscription;
import com.insription.user.core.api.InscriptionService;
import com.insription.user.core.spi.InscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class InscriptionServiceImp implements InscriptionService {

    private  final InscriptionRepository inscriptionRepository;



    @Override
    public UserInscription createInscription(UserInscription userInscription) {
        return inscriptionRepository.saveInscription(userInscription);

    }
}
