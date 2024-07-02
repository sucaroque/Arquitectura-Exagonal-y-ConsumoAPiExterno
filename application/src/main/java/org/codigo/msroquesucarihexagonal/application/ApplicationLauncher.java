package org.codigo.msroquesucarihexagonal.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.codigo.*")
@EntityScan("org.codigo.*")
@EnableFeignClients("org.codigo.*")
@ImportAutoConfiguration({FeignAutoConfiguration.class}) //Modularizacion
@EnableJpaRepositories("org.codigo")
public class ApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class);
    }
}
