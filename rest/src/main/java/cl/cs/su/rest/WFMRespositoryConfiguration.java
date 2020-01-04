package cl.cs.su.rest;

import cl.cs.su.core.hello.repository.HelloRepository;
import cl.cs.su.repository.hello.DefaultHelloRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WFMRespositoryConfiguration {
    @Bean
    public HelloRepository initDefaultHelloRepository() {
        return new DefaultHelloRepository();
    }
}
