package com.zemoso.solidprinciples.obey;

import java.util.HashMap;

public class EmployeeStore implements IEmployeeStore{
    HashMap<String,Employee> map = new HashMap<>();
    @Override
    public void addEmployee(Employee employee) {
        map.put(employee.getID(),employee);
    }

    @Override
    public Employee getEmployeeID(String ID)
    {       return map.getOrDefault(ID, null);
    }
}
