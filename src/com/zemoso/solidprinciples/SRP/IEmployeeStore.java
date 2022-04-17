package com.zemoso.solidprinciples.SRP;

public interface IEmployeeStore {
    public void addEmployee(Employee employee);
    public Employee getEmployeeID(String ID);
}
