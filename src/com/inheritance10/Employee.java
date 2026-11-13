
package com.inheritance10;

public class Employee {

    String department = "Engineering";
    private double salary = 45000;

    public double getSalary() {
        return salary;
    }

    public void showEmployeeDetails() {
        System.out.println("Parent Department: " + department);
        System.out.println("Parent Salary: " + salary);
    }
}
