package com.example.chatappthree.model;

public class ChatMeassage {

    private String content;
    private  String sender;
    private MeassageType type;
    public enum MeassageType{
        CHAT,LEAVE,JOIN
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MeassageType getType() {
        return type;
    }

    public void setType(MeassageType type) {
        this.type = type;
    }
}
