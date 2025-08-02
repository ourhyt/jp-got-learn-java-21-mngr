package art.ourhyt.learn_java.infrastructure.adapter.notification;

import art.ourhyt.learn_java.domain.port.out.NotificationSender;

public class WebhookNotification implements NotificationSender {

    @Override
    public String getType() {
        return "webhook";
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Sending WEBHOOK to " + to + ": " + message);
    }
}
