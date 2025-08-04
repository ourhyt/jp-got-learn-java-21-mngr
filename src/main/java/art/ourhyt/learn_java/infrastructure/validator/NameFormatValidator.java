package art.ourhyt.learn_java.infrastructure.validator;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.model.User;

@Component
public class NameFormatValidator extends AbstractUserValidator {
    @Override
    public void validate(User user) {
        if (!user.getName().matches("^[a-zA-Z ]+$")) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        validateNext(user);
    }
}
