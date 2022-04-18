package com.zemoso.solidprinciples.obey;

public class EmailContent{

    private String type;
    private String content;

    public EmailContent(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public EmailContent() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "EmailContent{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void setContent(String content) {
        this.content = content;
    }
}
