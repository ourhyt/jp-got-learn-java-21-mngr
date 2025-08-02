package art.ourhyt.learn_java.application.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import art.ourhyt.learn_java.domain.port.in.SendNotificationUseCase;
import art.ourhyt.learn_java.domain.port.out.NotificationSender;

@Service
public class NotificationServiceImpl implements SendNotificationUseCase {

    private final Map<String, NotificationSender> senderMap;

    public NotificationServiceImpl(List<NotificationSender> senders) {
        this.senderMap = senders.stream()
            .collect(Collectors.toMap(NotificationSender::getType, Function.identity()));
    }

    @Override
    public void send(String channel, String to, String message) {
        NotificationSender sender = senderMap.get(channel);
        if (sender == null) {
            throw new IllegalArgumentException("Invalid channel: " + channel);
        }
        sender.send(to, message);
    }
}
