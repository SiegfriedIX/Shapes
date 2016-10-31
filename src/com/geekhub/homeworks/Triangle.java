package com.geekhub.homeworks;

class Triangle implements Shape {
    private final int side1;
    private final int side2;
    private final int side3;

    Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public void calculateArea() {
        double p = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("Area is "+area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = (side1+side2+side3);
        System.out.println("Perimeter is "+perimeter);
    }
}
