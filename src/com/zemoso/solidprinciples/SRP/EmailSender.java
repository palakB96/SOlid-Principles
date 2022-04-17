package com.zemoso.solidprinciples.SRP;

public class EmailSender implements IEmailSender{
    @Override
    public void sendEmail(Employee employee, EmailContent content) {
    System.out.println("email sent to" + employee + "with content " + content);

    }
}
