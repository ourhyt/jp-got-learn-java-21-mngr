package art.ourhyt.learn_java.application.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.in.CreateUserUseCase;
import art.ourhyt.learn_java.domain.port.out.SaveUserPort;
import art.ourhyt.learn_java.infrastructure.validator.EmailBlacklistValidator;
import art.ourhyt.learn_java.infrastructure.validator.EmailNotEmptyValidator;
import art.ourhyt.learn_java.infrastructure.validator.NameFormatValidator;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserServiceImpl implements CreateUserUseCase {

    private final EmailNotEmptyValidator v1;
    private final NameFormatValidator v2;
    private final EmailBlacklistValidator v3;

    @Qualifier("jpaUserRepositoryAdapter")
    private final SaveUserPort saveUserPort;

    @PostConstruct
    public void initChain() {
        v1.linkWith(v2);
        v2.linkWith(v3);
    }

    @Override
    public User createUser(String name, String email) {
        User user = new User(null, name, email);
        v1.validate(user);
        return saveUserPort.save(name, email);
    }
}
