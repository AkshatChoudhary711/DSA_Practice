package org.practice.oops;


import java.util.ArrayList;
import java.util.Random;

/*
An interface is a blueprint for the class that is going to implement it.
It defines the methods that the class should implement.

Interface can have both methods and variables.
By default, the variables are public, static and final in Interfaces.
Also, methods are public and static

With the help of interfaces, we can achieve multiple inheritance in JAVA as it
requires 'implements' keyword to inherit the interface and there will be still room
to extend any class.

An interface can extend any other interface using 'extends' keyword.

A Class in java can implement multiple interfaces, separated by commas.

 */
public class InterfaceDemo {
}


interface Bank{
    void takeLoan(long accountNo,long amount, int years, double interest  );
    void deposit(long accountNo, long amount);
    void credit(long accountNo, long amount);
}

class Account{
    private long accountNo;
    private String firstName;
    private String lastName;
    private long mobileNo;
    private double balance;

    public Account(String firstName, String lastName, long mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.accountNo = generateAccNo(2025);
    }

    private static long generateAccNo(int seed){
        Random r = new Random(seed);
        long number = r.nextInt(1,999999999);
        int prefix = r.nextInt(1,9);
        return (prefix*10 + number);

    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

class SBI implements Bank{
    private long TotalCapital;
    private ArrayList<Account> accounts;

    public SBI(long totalCapital) {
        TotalCapital = totalCapital;
        accounts = new ArrayList<>();
    }

    public void setTotalCapital(long totalCapital) {
        TotalCapital = totalCapital;
    }

    public long getTotalCapital() {
        return TotalCapital;
    }

    @Override
    public void takeLoan(long accountNo, long amount, int years, double interest) {
        if (TotalCapital < amount){
            System.out.println("Sorry we don't have enough amount");
            return;
        }
        setTotalCapital(getTotalCapital()-amount);
        System.out.println("Loan Provided Successfully");

    }

    @Override
    public void deposit(long accountNo, long amount) {
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return;
        }
        setTotalCapital(getTotalCapital()+amount);
    }

    @Override
    public void credit(long accountNo, long amount) {
        if (TotalCapital < amount){
            System.out.println("Sorry we don't have enough amount");
            return;
        }
        setTotalCapital(getTotalCapital()-amount);
        System.out.println("Amount Credited Successfully");
    }

    public void addAccount(Account a){
        this.accounts.add(a);
        System.out.println("Account added successfully");
    }
}
