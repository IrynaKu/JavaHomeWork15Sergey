package com.company;

public class Employee {

    private String name;
    private int age;
    private boolean sex;
    private int salaryPerDay;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getSalary(Month [] monthsArray){

        int salaryForMonth = 0;
        for (int i = 0; i < monthsArray.length; i++){
            salaryForMonth += monthsArray[i].getNumberOfWorkingDays() * salaryPerDay;
        }
        return salaryForMonth;
    }
    // Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
    // зарплату за те месяцы которые были переданы в качестве аргумента.
}
