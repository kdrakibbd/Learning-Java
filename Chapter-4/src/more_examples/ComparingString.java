package more_examples;

import java.util.Scanner;

public class ComparingString {
    public static void main(String[] args) {
        String string1 = "Sumon";
        String string2 = "Sumon";

        // eikhane reference compare hocche String value compare hocche na
        if (string1 == string2)
            System.out.println("string1 and string2 are the same object");
        else
            System.out.println("string1 and string2 are different objects");

        System.out.println();

        // eikhane string equal kina check dicche
        if (string1.equals(string2))
            System.out.println("string1 and string2 have the same contents");
        else
            System.out.println("string1 and string2 are not equal");

        // eikhane string equal check dicche without case sensetive
        String st1 = "Sumon";
        String st2 = "SumoN";
        if (st1.equalsIgnoreCase(st2))
            System.out.println("str1 and str2 have the same contents");
        else
            System.out.println("str1 and str2 are not equal");


        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println();


        // compareTo()
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        // case sensitive compareTo
        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);

        // case insensetive compareToIgnoreCase
        if (city1.compareToIgnoreCase(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);

        System.out.println();


        // startWith() and endWith()
        String name = "Sumon Khan";
        System.out.println(name.startsWith("Su", 0));
        System.out.println(name.endsWith("an"));

        System.out.println("Welcome to Java".startsWith("We"));
        System.out.println("Welcome to Java".startsWith("we"));
        System.out.println("Welcome to Java".endsWith("va"));
        System.out.println("Welcome to Java".endsWith("v"));

        // contains()
        System.out.println("Welcome to Java".contains("to J"));
        System.out.println("Welcome to Java".contains("To"));



    }
}


