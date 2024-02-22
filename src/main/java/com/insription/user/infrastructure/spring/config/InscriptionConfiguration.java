package com.insription.user.infrastructure.spring.config;

import com.insription.user.core.api.InscriptionService;
import com.insription.user.core.spi.InscriptionRepository;
import com.insription.user.core.impl.InscriptionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InscriptionConfiguration {

    private final InscriptionRepository inscriptionRepository;

    public InscriptionConfiguration(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    @Bean
    public InscriptionService inscriptionRepository() {
        return new InscriptionServiceImpl(inscriptionRepository);
    }
}
