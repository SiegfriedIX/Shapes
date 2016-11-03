package com.geekhub.homeworks;

import java.util.Scanner;

class InputParamAndOutput {
    public static void main(String[] args) {
        Input.inputName();
    }
    static void inputCircleParam() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = s.nextInt();
        if (r<0){
            checkParamAlert();
        }else {
            Shape ourCircle = new Circle(r);
            ourCircle.calculateArea();
            ourCircle.calculatePerimeter();
        }
    }
    static void inputRectangleParam(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first side of rectangle");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter two sides of rectangle");
        int side1 = s1.nextInt();
        int side2 = s2.nextInt();
        if (side1<0||side2<0){
            checkParamAlert();
        }
        else {
            Shape ourRectangle = new Rectangle(side1, side2);
            ourRectangle.calculateArea();
            ourRectangle.calculatePerimeter();

            Rectangle subTriangle = new Rectangle(side1, side2);
            subTriangle.subTriangleCalculate();
        }
    }
    static void inputSquareParam(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = s.nextInt();
        if (side<0){
            checkParamAlert();
        }
        else {
            Shape ourSquare = new Square(side);
            ourSquare.calculateArea();
            ourSquare.calculatePerimeter();

            Square subTriangle = new Square(side);
            subTriangle.subTriangleCalculate1();
        }
    }
    static void inputTriangleParam() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the second side of triangle");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the third side of triangle");
        int side = s.nextInt();
        int side1 = s1.nextInt();
        int side2 = s2.nextInt();

        if (((side+side2-side1)>0)&&((side1+side2-side1)>0)&&((side+side1-side2)>0)){

        Shape ourTriangle = new Triangle(side, side1, side2);
        ourTriangle.calculateArea();
        ourTriangle.calculatePerimeter();}
        else {
            checkParamAlert();
            System.out.println("This triangle not exist!");
        }
    }
    private static void checkParamAlert(){
        System.out.println("Wrong parameters!");
    }
    }

