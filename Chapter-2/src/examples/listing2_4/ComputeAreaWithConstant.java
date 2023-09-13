package examples.listing2_4;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {

        final double PI = 3.1416;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area of the circle of radius" + radius + " is : " + area);
    }
}
