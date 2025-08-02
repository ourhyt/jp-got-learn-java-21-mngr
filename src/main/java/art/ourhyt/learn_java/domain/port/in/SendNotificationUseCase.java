package art.ourhyt.learn_java.domain.port.in;

public interface SendNotificationUseCase {
    void send(String channel, String to, String message);
}
