package ie.atu;

import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {

        Scanner sc1= new Scanner(System.in);

        System.out.println("Please enter a number");
        double firstNum = sc1.nextDouble();
        System.out.println("You entered " + firstNum);


        System.out.println("Please enter a second number");
        double secondNum = sc1.nextDouble();
        System.out.println("You entered " + secondNum);

        System.out.println("choose a operator: (add,sub,mul,div,exp)");
        String operator = sc1.next();
        switch(operator){
            case"add":

                add(firstNum,secondNum);
                break;
            case"sub":

                sub(firstNum,secondNum);
                break;
            case"mul":

                mul(firstNum,secondNum);
                break;
            case"div":

                div(firstNum,secondNum);
                break;
            case"exp":

                exp(firstNum,secondNum);
                break;
            default:
                System.out.println("Invalid operation");
                break;

        }


    }


    public static void add(double first,double second) {
        double result = first + second;
        System.out.println("the total is " + result);


    }

    public static void sub(double first,double second) {
        double result = first - second;
        System.out.println("the total is " + result);


    }
    public static void mul(double first,double second) {
        double result = first * second;
        System.out.println("the total is " + result);


    }

    public static void div(double first,double second) {
        double result = first / second;
        System.out.println("the total is " + result);


    }

    public static void exp(double first,double second ) {
        double result = Math.pow(first,second);
        System.out.println("the total is " + result);

    }
}






