package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
//	    TestingDateClass();
        TestBankA();
    }
    public static void TestingDateClass() {
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

    public static void TestBankA() throws Exception {
        BankAccount B = new BankAccount();
        System.out.println("Default Bank: " + B);
        B.deposit(100000.00);
        System.out.println("Your Bank Account has a total of: " + B);
    }
}
