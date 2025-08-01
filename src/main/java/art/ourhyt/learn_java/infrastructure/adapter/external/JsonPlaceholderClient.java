package art.ourhyt.learn_java.infrastructure.adapter.external;

import art.ourhyt.learn_java.domain.model.ExternalUser;
import art.ourhyt.learn_java.domain.port.out.ExternalUserFetcher;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
@RequiredArgsConstructor
public class JsonPlaceholderClient implements ExternalUserFetcher {

    @Qualifier("jsonPlaceholderClient")
    private final WebClient webClient;

    @Override
    public List<ExternalUser> fetchUsers() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToFlux(ExternalUser.class)
                .collectList()
                .block();
    }
}