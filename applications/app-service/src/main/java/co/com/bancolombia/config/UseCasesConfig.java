package co.com.bancolombia.config;

import co.com.bancolombia.model.publicacion.gateways.PublicacionRepository;
import co.com.bancolombia.usecase.crudpublicacionservicio.CrudPublicacionServicioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*@ComponentScan(basePackages = "co.com.bancolombia.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)*/
public class UseCasesConfig {
        @Bean
        public CrudPublicacionServicioUseCase crudPublicacionServicioUseCase(PublicacionRepository accountRepository) {
                return new CrudPublicacionServicioUseCase(accountRepository);
        }
}
