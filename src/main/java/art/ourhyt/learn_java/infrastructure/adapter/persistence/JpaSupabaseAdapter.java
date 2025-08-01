package art.ourhyt.learn_java.infrastructure.adapter.persistence;

import art.ourhyt.learn_java.domain.model.User;
import art.ourhyt.learn_java.domain.port.out.SaveUserPort;

import org.springframework.stereotype.Component;

@Component("jpaSupabaseAdapter")
public class JpaSupabaseAdapter implements SaveUserPort {
    @Override
    public User save(String name, String email) {
        System.out.println("Saving user to DB: " + name);
        return new User(1L, name, email);
    }
}
