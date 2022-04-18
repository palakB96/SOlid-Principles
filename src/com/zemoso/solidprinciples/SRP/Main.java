package com.zemoso.solidprinciples.SRP;

public class Main {

    public static void main(String args[])
    {
        Employee e = new Employee("palakb96",2000,"palak","bansal");
        EmployeeStore store = new EmployeeStore();
        store.addEmployee(e);
        System.out.println(store.getEmployeeID(e.getID()));
        EmailContent content = new EmailContent("text", "HI this is palak");
        EmailSender sender = new EmailSender();
        sender.sendEmail(e,content);
        EmployeeSalary salary = new EmployeeSalary();
        salary.totalSalary(e);


    }
}
