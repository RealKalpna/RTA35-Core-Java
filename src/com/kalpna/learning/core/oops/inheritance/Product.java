package com.kalpna.learning.core.oops.inheritance;

public class Product {

    private String name;
    private double price;
    private String brand;


    public void display(){
        System.out.println(
                "Product{" +
                        "nae='" + name + '\'' +
                        ", price=" + price +
                        ", brand='" + brand + '\'' +
                        '}'

                        );
    }

}

class Computer extends Product {
    @Override
    public void display() {

       /* System.out.println(
                "Computer{" +
                        "nae='" + name + '\'' +
                        ", price=" + price +
                        ", brand='" + brand + '\'' +
                        '}'
        );
    }
*/
    }
}
