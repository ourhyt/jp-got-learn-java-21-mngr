package art.ourhyt.learn_java.domain.port.out;

public interface NotificationSender {
    String getType(); // email, sms, webhook
    void send(String to, String message);
}