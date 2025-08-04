package art.ourhyt.learn_java.infrastructure.validator;

import java.util.List;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.model.User;

@Component
public class EmailBlacklistValidator extends AbstractUserValidator {
    private static final List<String> blacklist = List.of("bad@email.com");

    @Override
    public void validate(User user) {
        if (blacklist.contains(user.getEmail())) {
            throw new IllegalArgumentException("Email en lista negra");
        }
        validateNext(user);
    }
}
