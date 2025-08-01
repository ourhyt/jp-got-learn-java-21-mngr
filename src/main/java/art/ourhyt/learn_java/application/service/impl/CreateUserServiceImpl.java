package art.ourhyt.learn_java.application.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.in.CreateUserUseCase;
import art.ourhyt.learn_java.domain.port.out.SaveUserPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserServiceImpl implements CreateUserUseCase {

    @Qualifier("jpaUserRepositoryAdapter")
    private final SaveUserPort saveUserPort;

    @Override
    public User createUser(String name, String email) {
        return saveUserPort.save(name, email);
    }
}
