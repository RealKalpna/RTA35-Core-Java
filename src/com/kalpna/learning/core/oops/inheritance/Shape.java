package com.kalpna.learning.core.oops.inheritance;

class Shape {

    public void draw(){
        System.out.println("Shape is drawn.");
    }
}


class Ractangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw a Ractangle");
    }
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Draw a circle");
    }
}

class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw a square");
    }
}
class HiearchicalInheritanceExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape ractangular = new Ractangle();
        Shape circle = new Circle();
        Shape square = new Square();

        System.out.println("Shape type onject is drawing");
        shape.draw();

        System.out.println("Ractangle type onject is drawing");
        ractangular.draw();


        System.out.println("Circle type onject is drawing");
        circle.draw();

        System.out.println("Square type onject is drawing");
        square.draw();

    }
}


