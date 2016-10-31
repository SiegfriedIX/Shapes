package com.geekhub.homeworks;

import java.util.Scanner;

class Input {
        static void inputName() {
            Scanner name = new Scanner(System.in);
            System.out.println("Enter the type of Shape");
            String string = name.nextLine();
            switch (string) {
                case "Circle":
                    System.out.println("Circle,Ok!");
                    InputParamAndOutput.inputCircleParam();
                    break;
                case "Rectangle":
                    System.out.println("Rectangle, Ok!");
                    InputParamAndOutput.inputRectangleParam();
                    break;
                case "Square":
                    System.out.println("Square, Ok");
                    InputParamAndOutput.inputSquareParam();
                    break;
                case "Triangle":
                    System.out.println("Triangle, Ok!");
                    InputParamAndOutput.inputTriangleParam();
                    break;
                default:
                    System.out.println("You have written incorrect name, try again");
                    inputName();
                    break;
            }
        }
}
