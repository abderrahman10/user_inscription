package com.insription.user.api.mapper;

import com.insription.user.api.dto.InscriptionDto;
import com.insription.user.core.UserInscription;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;



public interface UserInscriptionDtoMapper {

    InscriptionDto toDto (UserInscription userInscription);
    UserInscription toDomain(InscriptionDto inscriptionDto);
}
