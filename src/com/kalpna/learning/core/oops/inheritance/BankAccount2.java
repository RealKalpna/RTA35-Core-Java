package com.kalpna.learning.core.oops.inheritance;

public class BankAccount2 {

    private String accountNumber;
    private double balance;

    public BankAccount2(String accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    protected void deposit(double amount){
        // since this method or behaviour is protected it will be accessed by the child class
        this.balance += amount;
        System.out.println("Deposited Amount:  " +amount);

    }

    protected void withdraw(double amount){
        // since this method or behaviour is protected it will be accessed by the child class
        if(amount<=balance){
            balance -= amount;
            System.out.println("Withdraw Amount:  " +amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
    public double getBalance(){
        return this.balance;
    }

}

class SavingAccount extends BankAccount2 {

    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interest){
        super(accountNumber, balance); // constructor chaining

    }
    public void applyInterest(){

        double interestEarnedAmount = this.getBalance() * (3/12) * (interestRate/100);
        this.deposit(interestEarnedAmount);

    }
}

class CurrentAccount extends BankAccount2{
    private double overDraftLimit;
    public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }
    @Override
    public void deposit(double amount) {
        overDraftLimit += amount;
        System.out.println("Amount paid to overDraft is :  " + amount);

    }
    @Override
    public void withdraw(double amount){
        double availableBalance = this.getBalance() + overDraftLimit;
        if(amount<=availableBalance) {
            this.overDraftLimit -= amount;
            System.out.println("Withdraw success on current account of amount: "+ amount);
            System.out.println("Current Account Balance is : " +(this.overDraftLimit + super.getBalance()));
        }
        else{
            System.out.println("Exceeds Overdraft limit");
        }
 }
 public double getBalance(){
        return super.getBalance() + overDraftLimit;

 }

}

class BankRunner{
    public static void main(String[] args) {
        BankAccount2 savingsAccount = new SavingAccount("120234", 7000, 2);
        BankAccount2 currentAccount = new CurrentAccount("14573", 3000,50000);

        savingsAccount.deposit(5000);
        savingsAccount.withdraw(3000);
        System.out.println("Current Balance is : "+savingsAccount.getBalance());
        savingsAccount.withdraw(10000);
        System.out.println("Current Balance is : "+savingsAccount.getBalance());



        currentAccount.deposit(5000);
        currentAccount.withdraw(3000);
        System.out.println("Current Balance is : " +currentAccount.getBalance());
        currentAccount.withdraw(10000);
        System.out.println("Current Balance is : "+currentAccount.getBalance());

    }

}
