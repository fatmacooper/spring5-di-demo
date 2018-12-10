package guru.springframework.config;

import guru.springframework.examplebeans.ApplicationYAMLDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationYAMLConfig {
    @Value("${com.orionsson.username}")
    String userName;
    @Value("${com.orionsson.password}")
    String password;
    @Value("${com.orionsson.url}")
    String url;

    @Bean
    ApplicationYAMLDataSource applicationYAMLDataSource(){
        ApplicationYAMLDataSource applicationYAMLDataSource = new ApplicationYAMLDataSource();
        applicationYAMLDataSource.setUserName(userName);
        applicationYAMLDataSource.setPassword(password);
        applicationYAMLDataSource.setUrl(url);
        return applicationYAMLDataSource;
    }
}
