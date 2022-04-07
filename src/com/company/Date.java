package com.company;

public class Date {
    // member variable
    private int month, year, day;

    // default constructor that sets date to 01/01/2000
    public Date() {
        day = month = 01;
        year = 2000;
    }

    static int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // constructor
    public Date(int day, int month, int year) {
        if(month < 1 || month > 12) {
            System.out.println("invalid month");
            return;
        }
        if(month == 2 && day > 28 && !isLeap(year)) {
            System.out.println("Fed does not have that many days");
            return;
        }
        if(day > daysInMonth[month] || day < 1) {
            System.out.println("invalid day");
            return;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // constructor that accepts a string in the form of mm/dd/yy or yyyy-mm-dd
    public Date(String d) {
        if(d.charAt(2) == '/') {
            // Date format mm/dd/yyyy split the string at /
            String[] strSplit = d.split("/");
            if(strSplit.length != 3) {
                System.out.println("The date is in an invalid format");
            }
            this.year = Integer.parseInt(strSplit[2]);
            this.setMonth(Integer.parseInt(strSplit[0]));
            //strSplit[0] would be day
            this.setDay(Integer.parseInt(strSplit[1])); // converts a string into an integer
        } else if(d.charAt(2) == '-') {
            // Date format yyyy-mm-dd split the string at -
            String[] strSplit = d.split("-");
            if(strSplit.length != 3) {
                System.out.println("The date is in an invalid format");
            }
            this.year = Integer.parseInt(strSplit[0]);
            this.setMonth(Integer.parseInt(strSplit[1]));
            // strSplit[0] would be day
            this.setDay(Integer.parseInt(strSplit[2])); // converts a string into an integer
        } else {
            System.out.println("Invalid date.");
        }
    }

    // return true if y is leap year and false if not.
    public boolean isLeap(int y)  {
        if (y % 4 != 0) {
            return false;
        } else if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // getters
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public int getDay() {
        return day;
    }
    // setters
    public void setMonth(int set_month) {
        if(set_month < 1 || set_month > 12) {
            System.out.println("invalid month");
            return;
        }
        this.month = set_month;
    }

    public void setYear(int set_year) {
        this.year = set_year;
    }

    public void setDay(int set_day) {
        if(this.month == 2 && set_day > 28 && !isLeap(this.year)) {
            System.out.println("February does not have that many days");
            return;
        }
        if(set_day > daysInMonth[this.month] || set_day < 1) {
            System.out.println("invalid day");
            return;
        }
        this.day = set_day;
    }

    public String toString() {
        String st = this.month + "/" + this.day + "/" + this.year; //"23/03/1999"
        return st;
    }
}
