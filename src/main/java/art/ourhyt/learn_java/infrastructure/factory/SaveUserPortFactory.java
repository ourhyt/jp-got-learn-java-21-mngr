package art.ourhyt.learn_java.infrastructure.factory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.port.out.SaveUserAlternativePort;

@Component
public class SaveUserPortFactory {
    private final Map<String, SaveUserAlternativePort> strategyMap;

    public SaveUserPortFactory(List<SaveUserAlternativePort> implementations) {
        this.strategyMap = implementations.stream()
            .collect(Collectors.toMap(SaveUserAlternativePort::getChannel, Function.identity()));
    }

    public SaveUserAlternativePort get(String channel) {
        return strategyMap.getOrDefault(channel, strategyMap.get("web"));
    }
}
