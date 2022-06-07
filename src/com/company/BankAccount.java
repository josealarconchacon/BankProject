package com.company;
import java.util.Vector;

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

public class BankAccount extends Client{
    private double Balance;
    private double InterestRate;
    private Date LastDateInterestWasPayed;
    private Date DayAccountWasOped;
    private Client PrimaryMember;

    public BankAccount(double balance, double interestRate, Date lastDateInterestWasPayed, Date dayAccountWasOped) throws Exception{
        this.Balance = balance;
        this.InterestRate = interestRate;
        this.LastDateInterestWasPayed = lastDateInterestWasPayed;
        this.DayAccountWasOped = dayAccountWasOped;
    }

    public BankAccount() {

    }

    public String toString() {
        return "Balance: " + this.Balance + " InterestRate: " + this.InterestRate +
                " LastDateInterestWasPayed: " + this.LastDateInterestWasPayed +
                " DayAccountWasOped: " + this.DayAccountWasOped + " client: " + this.PrimaryMember;
    }

    // payInterest that computes the interest to be paid starting at the last date to today
    public void payInterest(double payIR) throws Exception{
        try {
            Balance += (Balance * payIR);
        }catch (Exception e) {
            System.out.println("interest must be a valid value: " + e.getMessage());
        }
    }

    // deposit(double depositAmount) deposits increases balance by depositAmount
    public void deposit(double depositAmount) throws Exception {
        if(depositAmount > 0) {
            this.Balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " was made, New balance is " + this.Balance);
        } else {
            throw new Exception("Deposit Amount should be greater than zero");
        }
    }


    // withdraw(double withdrawAmount) decreases the balance by withdrawAmount or set to 0 if not enough funds.
    public void withdraw(double withdrawAmount) throws Exception{
        // check first if there is enough balance
        if(this.Balance - withdrawAmount <= 0) {
            System.out.println("Only " + this.Balance + " available in your account. Withdraw can't be processed");
            throw new Exception("No enough balance in your account");
        } else {
            this.Balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " was processed. Remaining balance is " + this.Balance);
        }
    }

    // getter and setters
    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        this.InterestRate = interestRate;
    }

    public Date getLastDateInterestWasPayed() {
        return LastDateInterestWasPayed;
    }

    public void setLastDateInterestWasPayed(Date lastDateInterestWasPayed) {
        this.LastDateInterestWasPayed = lastDateInterestWasPayed;
    }

    public Date getDayAccountWasOped() {
        return DayAccountWasOped;
    }

    public void setDayAccountWasOped(Date dayAccountWasOped) {
        this.DayAccountWasOped = dayAccountWasOped;
    }

    public Client getPrimaryMember() {
        return PrimaryMember;
    }

    public void setPrimaryMember(Client primaryMember) {
        this.PrimaryMember = primaryMember;
    }
}
