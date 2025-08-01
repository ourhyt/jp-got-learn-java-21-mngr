package art.ourhyt.learn_java.infrastructure.controller;

import art.ourhyt.learn_java.domain.model.ExternalUser;
import art.ourhyt.learn_java.domain.port.in.CreateExternalUserFetch;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExternalUserController {

    private final CreateExternalUserFetch createExternalUserFetch;

    @GetMapping("/external-users")
    public List<ExternalUser> getUsers() {
        return createExternalUserFetch.createExternalUser();
    }
}