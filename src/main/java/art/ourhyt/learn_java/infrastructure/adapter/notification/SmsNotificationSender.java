package art.ourhyt.learn_java.infrastructure.adapter.notification;

import org.springframework.stereotype.Component;

import art.ourhyt.learn_java.domain.port.out.NotificationSender;

@Component
public class SmsNotificationSender implements NotificationSender {

    @Override
    public String getType() {
        return "sms";
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}
