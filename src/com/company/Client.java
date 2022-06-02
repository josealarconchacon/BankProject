package com.company;

public class Client {
    private String FirstName, LastName, Address, email;
    private int SSN, PhoneNumber;

    public Client() {
        this("First Name", "Last Name", "129 default st" ,"default@gmail.com", 0000000000, 00000000);
        System.out.println("Empty Constructor called.");
    }

    public Client(String DoB, String f_name, String l_name, String address, int phoneNumber, int ssn) {
        this.FirstName = f_name;
        this.LastName = l_name;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
        this.SSN = ssn;
    }

    public boolean equals(Client client) {
        if(super.equals(client) && this.FirstName.equals(client.FirstName) && this.LastName.equals(client.LastName)
            && this.Address.equals(client.Address) && this.PhoneNumber == client.PhoneNumber && this.SSN == client.SSN) {
            return true;
        }
        return false;
    }

    // getters and setters
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSSN() {
        return SSN;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public int getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
