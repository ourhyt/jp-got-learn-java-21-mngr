package art.ourhyt.learn_java.infrastructure.controller;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.in.CreateUserUseCase;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return createUserUseCase.createUser(user.getName(), user.getEmail());
    }
}
