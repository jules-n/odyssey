package year.exp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public FirebaseAppCheckFilter firebaseTokenFilter() {
        return new FirebaseAppCheckFilter();
    }
}