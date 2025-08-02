package art.ourhyt.learn_java.domain.port.in;

import art.ourhyt.learn_java.domain.model.User;

public interface CreateUserFactoryUseCase {
    User createUser(String name, String email);
}