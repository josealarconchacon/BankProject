package com.company;

public class Client {
    private String FirstName, LastName, Address, email, PhoneNumber, DateOfBirth;
    private int SSN;
    private Date SetDate;

    public Client() {
        this("First Name", "Last Name", "129 default st" ,"default@gmail.com", "0000000000", 00000000, "2/22/2222");
        System.out.println("Empty Constructor called.");
    }

    public Client(String DoB, String f_name, String l_name, String address, String phoneNumber, int ssn, String dateOfBirth) {
        this.FirstName = f_name;
        this.LastName = l_name;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
        this.SSN = ssn;
        this.DateOfBirth = dateOfBirth;

    }

    public boolean equals(Client client) {
        if(super.equals(client) && this.FirstName.equals(client.FirstName) && this.LastName.equals(client.LastName)
            && this.Address.equals(client.Address) && this.PhoneNumber == client.PhoneNumber && this.SSN == client.SSN) {
            return true;
        }
        return false;
    }

    public String toString() {
        return " FirstName: " + this.FirstName + "\n" +
                " LastName: " + this.LastName +  "\n" +
                " Address: " + this.Address + "\n" +
                " Email: " + this.email + "\n" +
                " SSN: " + this.SSN + "\n" +
                " PhoneNumber: " + this.PhoneNumber;
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
    public int getSSN(String ssn) {
        return SSN;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Date getSetDate() {
        return SetDate;
    }
    public void setSetDate(Date setDate) {
        this.SetDate = setDate;
    }
}
