package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        TestBankA();
    }

    public static void TestBankA() throws Exception {
        BankAccount B = new BankAccount();
        System.out.println("Default Bank: " + B);
        System.out.println("----------------------------------------");
        Client C = new Client();
        C.setFirstName("Tom");
        C.setLastName("Peres");
        C.setPhoneNumber("2133323435");
        C.setEmail("tom@gmail.com");
        C.setAddress("1 Ave Apt 44A NY");
        C.setSSN(333333);
        System.out.println(C.toString());
        System.out.println("----------------------------------------");
        B.deposit(1000.00);
        System.out.println("Your Bank Account has a total of: " + B);
        System.out.println("----------------------------------------");
        B.withdraw(25);
        System.out.println("You withdraw a total amount of " + B + " from you Bank Account");
        System.out.println("----------------------------------------");
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
}