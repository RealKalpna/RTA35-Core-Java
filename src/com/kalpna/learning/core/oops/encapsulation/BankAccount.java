package com.kalpna.learning.core.oops.encapsulation;

public class BankAccount {
    private double balance;
    //private String accountNumber;
    public double getBalance() {
        return balance;
    }

    // creating parameterized constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println(" Initial balance should not be negative");
        }
    }


    // deposit
    public void deposit(double amount) {
        // in real we will create
        // login
        //authentication
        //authorization
        if (amount >= 0) {
            balance += amount; //balance = balance + amount
            System.out.println("Deposit amount: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }
    //withdraw
    public void withdraw(double amount){
        if(amount >= 0 && amount <= this.balance){
            balance -=amount;
            System.out.println(" Withdraw successful for: "+amount);
        }
        else{
            System.out.println(" Invalid withdrawal amount or insufficient funds");
        }
    }
}

class Runner{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(500);
        account.deposit(400);

        account.withdraw(400);
        account.withdraw(1200);

        System.out.println("Current balance is: "+account.getBalance());
    }
}