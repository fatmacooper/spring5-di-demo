package guru.springframework.config;

import guru.springframework.examplebeans.ApplicationDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Value("${db.username}")
    String username;
    @Value("${db.password}")
    String password;
    @Value("${db.url}")
    String url;

    @Bean
    ApplicationDataSource applicationDataSource(){
        ApplicationDataSource applicationDataSource = new ApplicationDataSource();
        applicationDataSource.setUserName(username);
        applicationDataSource.setPassword(password);
        applicationDataSource.setUrl(url);
        return applicationDataSource;
    }
}
