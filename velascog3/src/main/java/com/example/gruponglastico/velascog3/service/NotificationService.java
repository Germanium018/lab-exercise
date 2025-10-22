package com.example.gruponglastico.velascog3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gruponglastico.velascog3.entity.NotificationEntity;
import com.example.gruponglastico.velascog3.repository.NotificationRepository;

@Service
public class NotificationService {
    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<NotificationEntity> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public NotificationEntity getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public NotificationEntity addNotification(NotificationEntity notification) {
        return notificationRepository.save(notification);
    }

    public NotificationEntity updateNotification(Long id, NotificationEntity updatedNotification) {
        NotificationEntity existing = notificationRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setMessage(updatedNotification.getMessage());
            return notificationRepository.save(existing);
        }
        return null;
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
