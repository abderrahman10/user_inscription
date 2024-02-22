package com.insription.user.infrastructure.mapper;


import com.insription.user.core.UserInscription;
import com.insription.user.infrastructure.entity.UserInscriptionEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")

public interface UserInscriptionEntityMapper {

    UserInscriptionEntity toEntity(UserInscription userInscription);

    UserInscription toDomain(UserInscriptionEntity userInscriptionEntity);
}