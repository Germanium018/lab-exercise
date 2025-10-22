package com.example.gruponglastico.velascog3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gruponglastico.velascog3.entity.NotificationEntity;
import com.example.gruponglastico.velascog3.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
     private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<NotificationEntity> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public NotificationEntity getNotification(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    @PostMapping
    public NotificationEntity addNotification(@RequestBody NotificationEntity notification) {
        return notificationService.addNotification(notification);
    }

    @PutMapping("/{id}")
    public NotificationEntity updateNotification(@PathVariable Long id, @RequestBody NotificationEntity notification) {
        return notificationService.updateNotification(id, notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }
}
