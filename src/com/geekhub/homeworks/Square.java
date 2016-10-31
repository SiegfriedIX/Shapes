package com.geekhub.homeworks;

class Square implements Shape {
    private final int side;

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
    void subTriangleCalculate1(){
        double subTrArea = (side*side)/2.0;
        double subTrPerimeter = (side+side)+ Math.sqrt(side*side+side*side);
        System.out.println("Sub triangle area is " + subTrArea+" Perimeter is "+subTrPerimeter);
    }
}


