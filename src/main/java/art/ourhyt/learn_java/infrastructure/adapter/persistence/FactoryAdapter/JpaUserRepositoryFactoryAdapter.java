package art.ourhyt.learn_java.infrastructure.adapter.persistence.FactoryAdapter;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.out.SaveUserAlternativePort;

@Component
public class JpaUserRepositoryFactoryAdapter implements SaveUserAlternativePort {
    public String getChannel() { return "web"; }

    public User save(String name, String email) {
        System.out.println("Guardando en PostgreSQL");
        return new User(1L, name, email);
    }
}
