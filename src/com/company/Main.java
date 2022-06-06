package com.company;

public class Main {

    public static void main(String[] args) {
	    TestingDateClass();
    }
    public  static void TestingDateClass() {
        Date D = new Date();
        D.setYear(2004);
        D.setMonth(2);
        D.setDay(29);
        System.out.println("D: " + D);
        Date D1 = new Date(02, 23, 2001);
        System.out.println("D1: " + D1);
        Date D2 = new Date("4/21/1998");
        System.out.println("D2: " + D2);
        Date D3 = new Date("1245-10-22");
        System.out.println("D3: " + D3);
    }
}
