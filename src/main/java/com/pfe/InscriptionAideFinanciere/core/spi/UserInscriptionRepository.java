package com.pfe.InscriptionAideFinanciere.core.spi;

import com.pfe.InscriptionAideFinanciere.core.UserInscription;

public interface UserInscriptionRepository {

    UserInscription saveUserInscription(UserInscription userInscription);
}
