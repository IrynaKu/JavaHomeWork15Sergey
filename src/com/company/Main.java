package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setSalaryPerDay(50);
        System.out.println(employee1.getSalary(Month.MonthUtils.MONTHS));

        Manager manager1 = new Manager();
        manager1.setSalaryPerDay(50);
        manager1.setNumberOfSubordinates(10);
        System.out.println(manager1.getSalary(Month.MonthUtils.MONTHS));

    }


}
