package more_examples;

import java.util.Locale;

public class CharacterCalss {
    public static void main(String[] args) {
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('f'));

        String str = "Sumon";
        System.out.println(str.toUpperCase(Locale.getDefault()));

        // correct
        char a = '1';
        char b = '\u345d';
        char c = '\b';

        char x = 'a';
        char y = 'c';
        System.out.println(++x); //x 98 (b)
        System.out.println(y++); // y 99 (c) . after 100 (d)
        System.out.println((x - y));//

    }
}
