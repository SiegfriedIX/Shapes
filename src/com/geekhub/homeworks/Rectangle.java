package com.geekhub.homeworks;

class Rectangle implements Shape {
    final int side4;
    final int side5;

    Rectangle(int side4, int side5) {
        this.side4 = side4;
        this.side5 = side5;
    }
    @Override
    public void calculateArea() {
        double area = side4 * side5;
        System.out.println("Area is " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2.0 * side4 + 2.0 * side5;
        System.out.println("Perimeter is " + perimeter);
    }
}