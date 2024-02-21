package com.pfe.InscriptionAideFinanciere.infrastructure.mapper;

import com.pfe.InscriptionAideFinanciere.core.UserInscription;
import com.pfe.InscriptionAideFinanciere.infrastructure.entity.UserInscriptionEntity;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface UserInscriptionMapper {

    UserInscriptionEntity toUserInscriptionEntity(UserInscription userInscription);

    UserInscription toUserInscription(UserInscriptionEntity userInscriptionEntity);
}
