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
    static class SubTriangleForSquare extends Square {
        SubTriangleForSquare(int side) {
            super(side);
        }
        void subTriangleCalculate(){
            double subTrArea = (side*side)/2.0;
            double subTrPerimeter = (side+side)+ Math.sqrt(side*side+side*side);
            System.out.println("Sub triangle area is " + subTrArea+" Perimeter is "+subTrPerimeter);
        }
    }
    static class SubTriangleForRect extends Rectangle {
        SubTriangleForRect(int side4, int side5) {
            super(side4, side5);
        }
        void subTriangleCalculate1() {
            double subTrArea = (side4 * side5) / 2.0;
            double subTrPerimeter = (side4+side5)+ Math.sqrt(side4*side4+side5*side5);
            System.out.println("Sub triangle area is " + subTrArea+" Perimeter is "+subTrPerimeter);
        }
    }
}
