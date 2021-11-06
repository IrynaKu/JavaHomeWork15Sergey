package com.company;

public class Manager extends Employee {

    private String name;
    private int age;
    private boolean sex;
    private int salaryPerDay;
    private int numberOfSubordinates;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isSex() {
        return sex;
    }

    @Override
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    @Override
    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthsArray) {
        int salaryForMonth = 0;
        for (int i = 0; i < monthsArray.length; i++) {
            salaryForMonth += monthsArray[i].getNumberOfWorkingDays() * (salaryPerDay + (salaryPerDay * numberOfSubordinates) / 100);
        }
        return salaryForMonth;
    }
}



