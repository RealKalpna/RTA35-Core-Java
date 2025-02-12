package practice.excercise;

public class ShoppingCartExample {

    /*
    Encapsulating a Shopping Cart 🛒
Create a Product class with name, price, and stockQuantity (all private).
Provide methods for updating price, checking stock, and purchasing a product.
Prevent purchases if stock is insufficient.
    */

}

class Product{
    private String name;
    private double price;
    private int stockQuantity;

//constructor to initialize product
 public Product(String name, double price, int stockQuantity){
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
// Getter for product name,price,and stock quantity


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
// method to update price
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.println(" Updated price of product is : $ " + newPrice);
        } else {
            System.out.println("Invalid price. Price cannot be negative.");
        }
    }
    // method to check stock quantity
    public void checkingStock() {

        System.out.println("Stock quantity for "+name+" is "+ stockQuantity);
    }

    // method to purchase the product
    public void purchaseProduct(int quantity){

        if(quantity <= 0){
            System.out.println("Purchase cannot be processed! Quantity cannot be a negative number");
            return;
        }
        if(quantity <= stockQuantity){
            stockQuantity -= quantity;
            double totalCost = quantity * price;
            System.out.println("Purchase processed! "+ quantity+ " item bought at the total cost of $ "+totalCost);
            System.out.println("Remaining stocks: "+ stockQuantity);
        }
        else{
            System.out.println("Insufficient stock! Only "+stockQuantity+ " remaining of the product "+name);
        }

    }

    public static void main(String[] args) {
        // creating object of product
        Product product1 = new Product("Laptop", 999.00, 20);
        System.out.println("Product is created");
        product1.checkingStock();
        product1.purchaseProduct(2);
        product1.purchaseProduct(20);
        product1.updatePrice(800.00);
        product1.purchaseProduct(2);
        product1.checkingStock();

    }
}

