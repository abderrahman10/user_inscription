package com.insription.user.core.spi;

import com.insription.user.core.UserInscription;

public interface InscriptionRepository {

    UserInscription saveInscription(UserInscription userInscription);

}
