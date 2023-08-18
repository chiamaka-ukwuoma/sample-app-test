package com.interswitch.maven;

import java.util.*;

public class Users {

    private static final Scanner scanner = new Scanner(System.in);

    public static String collectUserInput(){
        while(true){
            System.out.printf("Press %d to add%nPress %d to subtract%nPress %d to multiply%nPress %d to divide%nPress %d to exit%n",
                    1,2,3,4,0);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                ArithmeticCalculations arithmeticCalculations = new ArithmeticCalculations(firstNumber, secondNumber);
                arithmeticCalculations.setFirstNumber(firstNumber);
                arithmeticCalculations.setSecondNumber(secondNumber);
                System.out.println("added values = " + arithmeticCalculations.addFirstAndSecondNumber());;
            }
            else if(choice == 2){
                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                ArithmeticCalculations arithmeticCalculations = new ArithmeticCalculations(firstNumber, secondNumber);
                arithmeticCalculations.setFirstNumber(firstNumber);
                arithmeticCalculations.setSecondNumber(secondNumber);
                System.out.println("subtracted values = " + arithmeticCalculations.subtractFirstAndSecondNumber());;
            }
            else if(choice == 3){
                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                ArithmeticCalculations arithmeticCalculations = new ArithmeticCalculations(firstNumber, secondNumber);
                arithmeticCalculations.setFirstNumber(firstNumber);
                arithmeticCalculations.setSecondNumber(secondNumber);
                System.out.println("multiplied values = " + arithmeticCalculations.multiplyFirstAndSecondNumber());;
            }
            else if(choice == 4){
                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                ArithmeticCalculations arithmeticCalculations = new ArithmeticCalculations(firstNumber, secondNumber);
                arithmeticCalculations.setFirstNumber(firstNumber);
                arithmeticCalculations.setSecondNumber(secondNumber);
                System.out.println("divided values = " + arithmeticCalculations.divideFirstAndSecondNumber());;
            }
            else if(choice == 0){
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
    }
}
