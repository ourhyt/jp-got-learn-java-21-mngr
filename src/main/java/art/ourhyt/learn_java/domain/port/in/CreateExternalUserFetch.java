package art.ourhyt.learn_java.domain.port.in;

import art.ourhyt.learn_java.domain.model.ExternalUser;
import java.util.List;

public interface CreateExternalUserFetch {
    List<ExternalUser> createExternalUser();
}
