package art.ourhyt.learn_java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean("jsonPlaceholderClient")
    public WebClient jsonPlaceholderClient(WebClient.Builder builder) {
        return builder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    @Bean("githubClient")
    public WebClient githubClient(WebClient.Builder builder) {
        return builder.baseUrl("https://api.github.com").build();
    }
}