package art.ourhyt.learn_java.application.service.impl;

import art.ourhyt.learn_java.domain.model.ExternalUser;
import art.ourhyt.learn_java.domain.port.in.CreateExternalUserFetch;
import art.ourhyt.learn_java.domain.port.out.ExternalUserFetcher;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExternalUserServiceImpl implements CreateExternalUserFetch {
    private final ExternalUserFetcher externalUserFetcher;

    @Override
    public List<ExternalUser> createExternalUser() {
        return externalUserFetcher.fetchUsers();
    }
}
