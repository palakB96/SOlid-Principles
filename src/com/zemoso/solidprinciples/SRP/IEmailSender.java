package com.zemoso.solidprinciples.SRP;

public interface IEmailSender {
    public void sendEmail(Employee employee, EmailContent content);

}
