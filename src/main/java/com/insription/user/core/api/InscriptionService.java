package com.insription.user.core.api;

import com.insription.user.core.UserInscription;

public interface InscriptionService {

    boolean inscrireUtilisateur(UserInscription userInscription);

    UserInscription findUserInscriptionById(int i);
}
