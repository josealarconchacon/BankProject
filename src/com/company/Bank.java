package com.company;
import java.util.Vector;

public class Bank extends Client {
    // BankAccount Vector
    private Vector<BankAccount>BankAccountVector = new Vector<BankAccount>();

    public Bank() {

    }
    public Bank(Vector<BankAccount> bankAccountVector) {
        BankAccountVector = bankAccountVector;
    }

    //    create a new account and add it to the vector
    public BankAccount addNewAccount(int ssn) {
        BankAccount account = new BankAccount();
        account.getPrimaryMember().setSSN(ssn);
        BankAccountVector.add(account);
        return account;
    }

    // retrieve an existing account based on SSN
    public BankAccount retrieveExistingAccount(int ssn) throws Exception {
        BankAccount account;
        try {
            for(BankAccount bankAccount : BankAccountVector) {
                if(bankAccount.getPrimaryMember().equals(ssn)) {
                    account = bankAccount;
                    System.out.println("Your Bank Account is: " + account.toString());
                    return account;
                }
            }
        } catch (Exception e) {
            throw new Exception("Bank account not found " + e.getMessage());
        } finally {
            System.out.println("Bank Account Found");
        }
        return null;
    }
    public void deleteAccount(int ssn) {
    }
}