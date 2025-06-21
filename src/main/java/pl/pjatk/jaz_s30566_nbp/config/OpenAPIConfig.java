package pl.pjatk.jaz_s30566_nbp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("NBP API Wrapper")
                        .version("1.0.0")
                        .description("You can get avarege USD price from selected scope.")
                        .contact(new Contact().name("Daniel").email("s30566@pjwstk.edu.pl")));
    }
}
