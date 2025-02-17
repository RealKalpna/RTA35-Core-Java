package practice.excercise.payment;

public abstract class Payment {
    /*
   3. Polymorphism Assignment (E-Commerce Payment System)
Scenario:
An E-commerce website has different payment methods:
Credit Card
PayPal
UPI
Each payment method processes payments differently.
Task:
Create a Payment class with processPayment(double amount).
Extend it into CreditCardPayment, PayPalPayment, and UPIPayment.
Override processPayment() in each subclass.
Use a single Payment reference to process payments dynamically.

     */
    double payment;

    public Payment(double payment){
        this.payment = payment;
    }
    public abstract double processPayment(double amount);

}

class CreditCardPayment extends Payment{

    public CreditCardPayment(double payment){
        super(payment);
        System.out.println("Inside CreditCard Payment.");
    }


    @Override
    public double processPayment(double amount) {
        System.out.println("Credit card payment is processing");
        double amountPaidAfterTransactionFee = amount - (0.2 * amount);
        System.out.println(" Credit Card payment amount is: "+amountPaidAfterTransactionFee);
        return amountPaidAfterTransactionFee;
    }
}


class UPIPayment extends Payment{
    public UPIPayment(double payment){
        super(payment);
        System.out.println("Inside UPI payment.");
    }


    @Override
    public double processPayment(double amount) {
        System.out.println("UPI payment is processing");
        System.out.println("UPI Payment amount is: "+ amount);
                return amount;
    }
}

class PayPalPayment extends Payment{
    public PayPalPayment(double payment){
        super(payment);
        System.out.println("Inside PayPal payment.");
    }


    @Override
    public double processPayment(double amount) {
        System.out.println("PayPal payment is processing");
        double fixedFee = 10;
        double amountToBePaidAfterFixedFee = (amount - fixedFee);
        System.out.println("PayPal payment amount is: "+amountToBePaidAfterFixedFee);
        return amountToBePaidAfterFixedFee;
    }
}
class PaymentRummer{
    public static void main(String[] args) {

        Payment creditPayment = new CreditCardPayment(100.00);
        creditPayment.processPayment(100.00);
        System.out.println("Credit Card Payment done");
        Payment upiPayment = new UPIPayment(100.00);
        upiPayment.processPayment(100.00);
        System.out.println("UPI Payment done");
        Payment payPalPayment = new PayPalPayment(100.00);
        payPalPayment.processPayment(100.00);
        System.out.println("Paypal Payment done");

        // dynamically calling payment method, runtime polymorphism or dynamic polymorphism
        System.out.println("#####Dynamically calling####");
        Payment payment;
        payment = new CreditCardPayment(200.00); // dynamically calling the overridden method
        double processedPayment = payment.processPayment(200.00);
        System.out.println("Credit card payment is: "+processedPayment);

        payment = new UPIPayment(200.00); // dynamically calling the overridden method
        double processedUPIPayment = payment.processPayment(200.00);
        System.out.println("UPI payment is: "+processedUPIPayment);

        payment = new PayPalPayment(200.00); // dynamically calling the overridden method
        double processedPaypalPayment = payment.processPayment(200.00);
        System.out.println("Paypal payment is: "+processedPaypalPayment);

    }

}
