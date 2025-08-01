package art.ourhyt.learn_java.domain.port.out;

import art.ourhyt.learn_java.domain.model.ExternalUser;
import java.util.List;

public interface ExternalUserFetcher {
    List<ExternalUser> fetchUsers();
}