package com.insription.user.api;


import com.insription.user.api.dto.InscriptionDto;
import com.insription.user.api.mapper.UserInscriptionDtoMapper;
import com.insription.user.core.api.InscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class InscriptionController {

    private final InscriptionService inscriptionService;

    private final UserInscriptionDtoMapper userInscriptionDtoMapper;



    @PostMapping("users")
    public ResponseEntity<InscriptionDto> saveInscription(@RequestBody InscriptionDto userDto) {

        return new ResponseEntity<>(userInscriptionDtoMapper.toDto(inscriptionService.createInscription(userInscriptionDtoMapper.toDomain(userDto))),
                HttpStatus.CREATED);

    }

}