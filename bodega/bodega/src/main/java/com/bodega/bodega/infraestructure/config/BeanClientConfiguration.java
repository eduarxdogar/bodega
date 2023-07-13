package com.bodega.bodega.infraestructure.config;

import com.bodega.bodega.application.ClientService;
import com.bodega.bodega.application.ICreateClientService;
import com.bodega.bodega.domain.ports.IClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClientConfiguration {

    @Bean
    ICreateClientService ClientBeanService(final IClientRepository iClientRepository){
        return new ClientService(iClientRepository);
    }
}
