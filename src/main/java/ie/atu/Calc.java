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

        System.out.println("choose a operator: (add,sub,mul,div)");
        String operator = sc1.next();
        switch(operator){
            case"add":
                double sum = firstNum + secondNum;
                System.out.println("The sum is: "+sum);
                break;


        }


    }
}
