package com.zemoso.solidprinciples.violation;

import com.zemoso.solidprinciples.obey.Employee;

public class Owner extends Employee {

    @Override
    public double getSalary() throws Exception {
        throw new Exception("I am the owner");
    }

}
