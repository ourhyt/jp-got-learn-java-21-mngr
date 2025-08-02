package art.ourhyt.learn_java.infrastructure.adapter.persistence.FactoryAdapter;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.out.SaveUserAlternativePort;

@Component
public class MemoryUserFactoryAdapter implements SaveUserAlternativePort {
    public String getChannel() { return "batch"; }

    public User save(String name, String email) {
        System.out.println("Guardando en memoria temporal");
        return new User(3L, name, email);
    }
}   
