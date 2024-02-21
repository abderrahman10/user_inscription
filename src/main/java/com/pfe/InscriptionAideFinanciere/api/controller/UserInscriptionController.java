package com.pfe.InscriptionAideFinanciere.api.controller;


import com.pfe.InscriptionAideFinanciere.api.dto.UserInscriptionDto;
import com.pfe.InscriptionAideFinanciere.core.api.UserInscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserInscriptionController {

    private final UserInscriptionService userInscriptionService;



    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> inscription(@RequestBody UserInscriptionDto userInscriptionDto) {

        return  null;
    }
}