package com.zemoso.solidprinciples.obey;

public class EmployeeSalary implements IEmployeeSalary {


    @Override
    public void getSalary(Employee employee) {
        System.out.println("employee salary is "+ employee.getFirstname()+ " Salary is " + employee.salary);
    }
}
