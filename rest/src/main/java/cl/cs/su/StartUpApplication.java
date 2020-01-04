package cl.cs.su;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cl.cs.wfm")
public class StartUpApplication {
    public static void main(String[] args) {
            SpringApplication.run(StartUpApplication.class, args);
        }
}
