package com.example.gruponglastico.velascog3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notifications")
public class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    private String message;

    public NotificationEntity() {
    }

    public NotificationEntity(Long notificationId, String message) {
        this.notificationId = notificationId;
        this.message = message;
    }   

    public Long getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }   
    public String getMessage() {
        return message;
    }   
    public void setMessage(String message) {
        this.message = message;
    }
}
