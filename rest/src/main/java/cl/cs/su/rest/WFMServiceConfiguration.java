package cl.cs.su.rest;
import cl.cs.su.core.hello.controller.DefaultHelloController;
import cl.cs.su.core.hello.repository.HelloRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WFMServiceConfiguration {

    @Bean
    @Primary
    public DefaultHelloController initDefaultHelloController(HelloRepository helloRepository) {
        return new DefaultHelloController(helloRepository);
    }
}
