package com.company;

public class Client {
    private String FirstName, LastName, Address;
    private String email, PhoneNumber;
    private int Ssn;

    public Client() {
        FirstName = LastName = Address = email = PhoneNumber = "";
        Ssn = 0;
    }

    public Client(String DoB, String f_name, String l_name, String address, String phoneNumber, int ssn) {
        this.FirstName = f_name;
        this.LastName = l_name;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
        this.Ssn = ssn;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public int getSsn() {
        return Ssn;
    }

    public void setSsn(int ssn) {
        this.Ssn = ssn;
    }

    public boolean equals(Client client) {
        if(super.equals(client) && this.FirstName.equals(client.FirstName) && this.LastName.equals(client.LastName)
            && this.Address.equals(client.Address) && this.PhoneNumber.equals(client.PhoneNumber) && this.Ssn == client.Ssn) {
            return true;
        }
        return false;
    }
}
