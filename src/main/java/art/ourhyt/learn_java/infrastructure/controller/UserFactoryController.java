package art.ourhyt.learn_java.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import art.ourhyt.learn_java.domain.port.in.CreateUserFactoryUseCase;
import art.ourhyt.learn_java.domain.model.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserFactoryController {

    private final CreateUserFactoryUseCase createUserFactoryUseCase;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(
        @RequestParam String channel,
        @RequestParam String name,
        @RequestParam String email) {

        User user = createUserFactoryUseCase.createUser(name, email);
        return ResponseEntity.ok(user);
    }
}
