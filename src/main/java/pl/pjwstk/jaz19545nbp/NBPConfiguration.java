package pl.pjwstk.jaz19545nbp;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NBPConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().errorHandler(new RestTemplateResponseErrorHandler())
                .build();
    }

    @Bean
    public NBP nbp(){
        NBP nbp = new NBP();
        return nbp;
    }

}
