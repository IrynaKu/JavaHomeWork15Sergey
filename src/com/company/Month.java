package com.company;

public class Month {

    private String monthName;
    private int numberOfDays;

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    private int numberOfWorkingDays;


    public Month(String monthName, int numberOfDays, int numberOfWorkingDays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public static class MonthUtils {

        public static final Month[] MONTHS =
                {new Month("January", 30, 20),
                 new Month("February", 28, 18),
                 new Month("March", 31,21)
                };
    }

}
