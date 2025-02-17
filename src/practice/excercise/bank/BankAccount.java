package practice.excercise.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    /*
    Scenario:
You are developing a banking system where customers can open a bank account and deposit or withdraw money. However, the balance should not be directly accessible from outside the class.
Task:
Create a BankAccount class.
Use private variables for accountNumber, accountHolderName, and balance.
Provide public getter methods for accountNumber and accountHolderName, but not for balance.
Provide methods deposit(double amount) and withdraw(double amount), ensuring that the balance cannot go negative.
Test the program by creating multiple accounts and performing transactions.
     */

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        System.out.println(" BankAccount accountNumber= "+ this.accountNumber+ ", accountHolderName = " + this.accountHolderName+ " is created.");
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double deposit(double amount){
        this.balance +=amount;
        System.out.println("Deposit successful for the amount: "+amount + " Your current balance is: " +this.balance );
        return balance;
    }

    public double withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdrawal successful for the amount: "+amount + " Your current balance is: " +this.balance );
        }
        else{
            System.out.println("Balance not sufficient for withdrawal.");
        }
        return this.balance;
    }
}

class BankRunner{
    public static void main(String[] args) {
        System.out.println("####Creating bank account####");
        BankAccount bankAccount1 = new BankAccount(1234, "Krish");
        System.out.println("Thank you for accessing Bank account!");
        bankAccount1.deposit(500);
        System.out.println("Thank you for using the bank deposit service!");
        bankAccount1.withdraw(200);
        System.out.println("Thank you for using the bank withdrawal service!");
        bankAccount1.withdraw(500);
        System.out.println("Thank you for using the bank withdrawal service!");

        System.out.println("####Creating bank account####");
        BankAccount bankAccount2 = new BankAccount(5678, "Harry");
        System.out.println("Thank you for accessing Bank account!");
        bankAccount2.deposit(500);
        System.out.println("Thank you for using the bank deposit service!");
        bankAccount2.withdraw(200);
        System.out.println("Thank you for using the bank withdrawal service!");
        bankAccount2.withdraw(500);
        System.out.println("Thank you for using the bank withdrawal service!");

        System.out.println("####Taking input for account number and account holder name from the console####");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Account Number!");
        int accountNumber = 0;
        /*
        1. If it is an integer number than code will execute
        2. else it will go to try catch block and catch the exception
        3. exception caught it will ask again to put the integer number
        while(true){}
         */

            try {
                accountNumber = scan.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("inputMismatchException caught!" + inputMismatchException);
            }

        scan.nextLine();
        System.out.println(" Please enter Bank account holder's name!");
        String accountHolderName = scan.nextLine();

        BankAccount bankAccount3 = new BankAccount(accountNumber, accountHolderName);
        System.out.println("bankAccount3 created " + bankAccount3);
        System.out.println("Thank you for accessing Bank account!");
        bankAccount3.deposit(500);
        System.out.println("Thank you for using the bank deposit service!");
        bankAccount3.withdraw(200);
        System.out.println("Thank you for using the bank withdrawal service!");
        bankAccount3.withdraw(500); // should fail
        System.out.println("Thank you for using the bank withdrawal service!");
}

}
