
package com.inheritance10;

public class TeamLead extends Employee {

    String department = "Development";

    public void showTeamLeadDetails() {

        System.out.println("Child Department: " + department);

        System.out.println("Parent Department: " + super.department);

        System.out.println("Employee Salary: " + getSalary());
    }
}
