package examples.listing2_3;

import java.util.Scanner;

public class ComputeAvarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double avarage = (number1 + number2 + number3) / 3.0;

        System.out.println("The avarage of "+number1+" "+number2+ " "+number3+ " is : "+avarage);
    }
}
