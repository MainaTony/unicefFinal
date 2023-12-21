package com.example.mediawatch;

public class Message {
    private String messageId;
    private String senderId;
    private String content;

    public Message() {
    }

    public Message(String messageId, String senderId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.content = content;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
