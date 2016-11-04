package com.geekhub.homeworks;

class Square implements Shape {
    final int side;

    Square(int side) {
        this.side = side;
    }
    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area is " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 4.0 * side;
        System.out.println("Perimeter is " + perimeter);
    }
}


