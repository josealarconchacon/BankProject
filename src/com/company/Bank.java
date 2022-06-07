package com.company;
import java.util.Vector;
import java.util.Scanner;

/*
 * Design a class bank that manages a vector of bank accounts
 * - Vector of bankAccounts
 * - Account number that changes each time an account is created
  methods to
 * - create a new account and add it to the vector
 * - retrieve an existing account based on SSN
 * - retrieve account based on first and last name
 * - modify an account with new info, except the account number
 * - delete an account based on SSN or first and last name.
 */
public class Bank {
    // BankAccount Vector
    private Vector<BankAccount>BankAccountVector;
    private String AccountNumber;


//    create a new account and add it to the vector
    public void addNewAccount(BankAccount account, int ssn) {
        account = new BankAccount();
        account.getPrimaryMember().setSSN(ssn);
        ssn++;
        BankAccountVector.add(account);
    }

    // retrieve an existing account based on SSN
    public BankAccount retrieveExistingAccount(int ssn) {
        return null;
    }

    // modify an account with new info, except the account number
    public void modifyAccount() {

    }

    // delete an account based on SSN or first and last name.
    public void deleteAccount(String lastName) {
        BankAccountVector.removeIf(selectedAccount -> selectedAccount.getPrimaryMember().getLastName() == lastName);
    }
}
