package com.zemoso.solidprinciples.obey;

public class Employee {

    private String ID;
    public double salary;
    private String firstname, lastname;

    public String getID() {
        return ID;
    }

    public double getSalary() throws Exception {
        return salary;
    }

    public Employee(String ID, double salary, String firstname, String lastname) {
        this.ID = ID;
        this.salary = salary;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Employee(String ID, String firstname, String lastname) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", salary=" + salary +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Employee() {
    }
}
