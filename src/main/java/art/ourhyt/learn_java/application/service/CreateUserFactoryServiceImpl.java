package art.ourhyt.learn_java.application.service;

import org.springframework.stereotype.Service;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.in.CreateUserFactoryUseCase;
import art.ourhyt.learn_java.infrastructure.factory.SaveUserPortFactory;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserFactoryServiceImpl implements CreateUserFactoryUseCase {

    private final SaveUserPortFactory factory;

    @Override
    public User createUser(String name, String email) {
        return factory.get(name).save(name, email);
    }
}
