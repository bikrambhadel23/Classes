package com.bikram;

public class BankAccount {
    private long accNumber;
    private long accbalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("This is the empty constructor called ");
    }

    public BankAccount(long accNumber, long accbalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructors with parameter called");
        this.accNumber=accNumber;
        this.accbalance=accbalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void deposit(double depositAmount){
        this.accbalance+=depositAmount;
    }
    public void withdraw(double withdrawAmount) {
        if (accbalance - withdrawAmount < 0) {
            System.out.println("Only " + accbalance + " balance available, withdrawal not allowed");
        } else {
            this.accbalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " made new balance of " + accbalance);
        }
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public long getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(long accbalance) {
        this.accbalance = accbalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}