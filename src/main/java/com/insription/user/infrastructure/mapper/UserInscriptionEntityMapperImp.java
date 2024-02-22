package com.insription.user.infrastructure.mapper;

import com.insription.user.core.UserInscription;
import com.insription.user.infrastructure.entity.UserInscriptionEntity;
import org.springframework.stereotype.Component;

@Component
public class UserInscriptionEntityMapperImp implements  UserInscriptionEntityMapper{
    @Override
    public UserInscriptionEntity toEntity(UserInscription userInscription) {
        return UserInscriptionEntity.builder()
                .id(userInscription.getId())
                .civility(userInscription.getCivility())
                .phone(userInscription.getPhone())
                .dcrDepartement(userInscription.getDcrDepartement())
                .dcrName(userInscription.getDcrName())
                .token(userInscription.getToken())
                .status(userInscription.getStatus())
                .firstName(userInscription.getFirstName())
                .lastName(userInscription.getLastName())
                .email(userInscription.getEmail())
                .build();
    }

    @Override
    public UserInscription toDomain(UserInscriptionEntity userInscriptionEntity) {
        return UserInscription.builder()
                .id(userInscriptionEntity.getId())
                .civility(userInscriptionEntity.getCivility())
                .phone(userInscriptionEntity.getPhone())
                .dcrDepartement(userInscriptionEntity.getDcrDepartement())
                .dcrName(userInscriptionEntity.getDcrName())
                .token(userInscriptionEntity.getToken())
                .status(userInscriptionEntity.getStatus())
                .firstName(userInscriptionEntity.getFirstName())
                .lastName(userInscriptionEntity.getLastName())
                .email(userInscriptionEntity.getEmail())
                .build();
    }
}
