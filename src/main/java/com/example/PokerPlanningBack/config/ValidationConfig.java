package com.example.PokerPlanningBack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.security.KeyStore;

/**
 * Rayen Benoun
 */

@Configuration
public class ValidationConfig {
    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
    return new LocalValidatorFactoryBean();
    }




}
