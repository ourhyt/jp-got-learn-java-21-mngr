package art.ourhyt.learn_java.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import art.ourhyt.learn_java.domain.port.in.SendNotificationUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final SendNotificationUseCase sendNotificationUseCase;

    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestParam String channel, @RequestParam String to, @RequestParam String message) {
        sendNotificationUseCase.send(channel, to, message);
        return ResponseEntity.ok("Notification sent successfully" + channel);
    }
}
