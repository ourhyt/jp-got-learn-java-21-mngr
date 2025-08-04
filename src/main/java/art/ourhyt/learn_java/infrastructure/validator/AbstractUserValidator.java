package art.ourhyt.learn_java.infrastructure.validator;

import art.ourhyt.learn_java.domain.chain.UserValidator;
import art.ourhyt.learn_java.domain.model.User;

public abstract class AbstractUserValidator implements UserValidator {
    private UserValidator next;

    public UserValidator linkWith(UserValidator next) {
        this.next = next;
        return next;
    }

    protected void validateNext(User user) {
        if (next != null) {
            next.validate(user);
        }
    }
}
