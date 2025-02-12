package com.kalpna.learning.core.oops.polymorphism;



class Payment{
    public void processPayment(double amount){
        System.out.println("Processing the payment of :: "+ amount);
    }
}
 class CreditCard extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of "+amount+" through Credit card");
    }
 }

 class Paypal extends Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of "+amount+" through Paypal");
    }

 }


public class MethodOverridding {
    public static void main(String[] args) {
         Payment payment; // parent type reference variable
        payment = new CreditCard();
        payment.processPayment(20.00);
        System.out.println(payment);
        payment = new Paypal();
        payment.processPayment(40.00);
        System.out.println(payment);

    }
}
