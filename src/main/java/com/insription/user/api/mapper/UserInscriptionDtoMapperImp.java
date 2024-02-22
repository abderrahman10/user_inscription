package com.insription.user.api.mapper;

import com.insription.user.api.dto.InscriptionDto;
import com.insription.user.core.UserInscription;
import org.springframework.stereotype.Component;

@Component
public class UserInscriptionDtoMapperImp implements  UserInscriptionDtoMapper{
    @Override
    public InscriptionDto toDto(UserInscription userInscription) {
        return InscriptionDto.builder()
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
    public UserInscription toDomain(InscriptionDto inscriptionDto) {
        return UserInscription.builder()
                .id(inscriptionDto.getId())
                .civility(inscriptionDto.getCivility())
                .phone(inscriptionDto.getPhone())
                .dcrDepartement(inscriptionDto.getDcrDepartement())
                .dcrName(inscriptionDto.getDcrName())
                .token(inscriptionDto.getToken())
                .status(inscriptionDto.getStatus())
                .firstName(inscriptionDto.getFirstName())
                .lastName(inscriptionDto.getLastName())
                .email(inscriptionDto.getEmail())
                .build();
    }
}
