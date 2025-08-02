package art.ourhyt.learn_java.infrastructure.adapter.notification;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.port.out.NotificationSender;

@Component
public class EmailNotificationSender implements NotificationSender {

    @Override
    public String getType() {
        return "email";
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Sending EMAIL to " + to + ": " + message);
    }
}
