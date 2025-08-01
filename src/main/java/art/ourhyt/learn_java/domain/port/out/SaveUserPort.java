package art.ourhyt.learn_java.domain.port.out;

import art.ourhyt.learn_java.domain.model.User;

public interface SaveUserPort {
    User save(String name, String email);
}
