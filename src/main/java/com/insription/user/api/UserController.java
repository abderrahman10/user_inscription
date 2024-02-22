package com.insription.user.api;

import com.insription.user.core.api.InscriptionService;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final InscriptionService inscriptionService;

    public UserController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }
}
