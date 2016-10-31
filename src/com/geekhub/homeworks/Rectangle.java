package com.geekhub.homeworks;

class Rectangle implements Shape {
    private final int side1;
    private final int side2;

    Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public void calculateArea() {
        double area = side1 * side2;
        System.out.println("Area is " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2.0 * side1 + 2.0 * side2;
        System.out.println("Perimeter is " + perimeter);
    }
    void subTriangleCalculate() {
        double subTrArea = (side1 * side2) / 2.0;
        double subTrPerimeter = (side1+side2)+ Math.sqrt(side1*side1+side2*side2);
        System.out.println("Sub triangle area is " + subTrArea+" Perimeter is "+subTrPerimeter);
    }
}