package com.company;

/*
 * Design a class that serves as records of bank accounts. Member variables are
 * - balance
 * - interest rate
 * - last date interest was paid.
 * - date of opening the account
 * - primary member client (see Client class)
 * - Vector of secondary holders up to three secondary holders
 * - Methods:
 * - getters and setters fo balance, interest rate, primary holder, ....
 * - payInterest that computes the interest to be paid starting at the last date to today.
 * - deposit(double m) deposits increases balance by m
 * - withdraw(double m) decreases the balance by m or set to 0 if not enough funds.
 * - setPrimaryHolder(Client C) changes primary holder to new Client.
 *
 */

public class BankAccount {
    private double Balance, InterestRate;
    private int LastDateInterestWasPayed, DayAccountWasOped;
    private Client client;

    public BankAccount() {
        this(0.00, 0.00,0/00/0000, 0/00/000);
        System.out.println("Empty Constructor called.");
    }

    public BankAccount(double balance, double interestRate, int lastDateInterestWasPayed, int dayAccountWasOped) {
        this.Balance = balance;
        this.InterestRate = interestRate;
        this.LastDateInterestWasPayed = lastDateInterestWasPayed;
        this.DayAccountWasOped = dayAccountWasOped;
    }

    // payInterest that computes the interest to be paid starting at the last date to today


    // deposit(double depositAmount) deposits increases balance by depositAmount
    public void deposit(double depositAmount) {
        this.Balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " was made, New balance is " + this.Balance);
    }


    // withdraw(double withdrawAmount) decreases the balance by withdrawAmount or set to 0 if not enough funds.
    public void withdraw(double withdrawAmount) {
        // check first if there is enough balance
        if(this.Balance - withdrawAmount <= 0) {
            System.out.println("Only " + this.Balance + " available in your account. Withdraw can't be processed");
        } else {
            this.Balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " was processed. Remaining balance is " + this.Balance);
        }
    }

    // setPrimaryHolder(Client C) changes primary holder to new Client.
    public void setPrimaryHolder(Client client) {

    }

    // getter and setters

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public int getLastDateInterestWasPayed() {
        return LastDateInterestWasPayed;
    }

    public void setLastDateInterestWasPayed(int lastDateInterestWasPayed) {
        LastDateInterestWasPayed = lastDateInterestWasPayed;
    }

    public int getDayAccountWasOped() {
        return DayAccountWasOped;
    }

    public void setDayAccountWasOped(int dayAccountWasOped) {
        DayAccountWasOped = dayAccountWasOped;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
