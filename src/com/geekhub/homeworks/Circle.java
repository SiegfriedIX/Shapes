package com.geekhub.homeworks;


class Circle implements Shape {
    private final int r;

    Circle(int r){
        this.r = r;
    }
    @Override
    public void calculateArea() {
        double area = Math.PI * (r * r);
        System.out.println("Area is "+ area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = Math.PI * (r + r);
        System.out.println("Circumference is "+ perimeter);
    }
}
