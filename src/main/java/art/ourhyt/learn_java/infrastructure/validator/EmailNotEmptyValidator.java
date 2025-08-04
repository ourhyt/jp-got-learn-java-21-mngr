package art.ourhyt.learn_java.infrastructure.validator;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.model.User;

@Component
public class EmailNotEmptyValidator extends AbstractUserValidator {
    @Override
    public void validate(User user) {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email vacío");
        }
        validateNext(user);
    }
}
