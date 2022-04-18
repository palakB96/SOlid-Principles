package com.zemoso.solidprinciples.SRP;

public class EmployeeSalary implements IEmployeeSalary {


    @Override
    public void totalSalary(Employee employee) {
        System.out.println("employee salary is "+ employee.getFirstname()+ " Salary is " + employee.salary);
    }
}
