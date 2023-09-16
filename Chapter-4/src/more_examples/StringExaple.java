package more_examples;

import java.util.Locale;

public class StringExaple {
    public static void main(String[] args) {

        // normal print and sting length
        String messege = "Welcome to java";
        int len = messege.length();
        System.out.println("String value is : " + messege + " and length is " + len);

        // specfice character using Index
        System.out.println(
                "First character is : " + messege.charAt(0) + " and last character is : " + messege.charAt(len - 1));

        // different way to get sting length
        int len2 = "Sumon bhai".length();
        System.out.println("\"Sumon bhai\" length is :" + len2);

        //Concatening String using function
        String s1 = "Hello ";
        String s2 = "Bangladesh";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // Concatenign String using +
        String str1 = "My name is ";
        String str2 = "Sumon";
        String str3 = str1 + str2;
        System.out.println(str3);

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s// becomes Chapter2
        // String Supplement is concatenated with character B
        String s11 = "Supplement" + 'B'; // s1 becomes SupplementB

        int i = 1;
        int j = 2;

        System.out.println("i and j : is " + i + j);
        System.out.println("i and j : is " + (i + j));
        System.out.println(i + j);

        // converting string
        String string1 = "Sumon bhai jindabad";
        String string2 = "Rakib bhai jindabad";
        System.out.println(string1.toLowerCase(Locale.getDefault()));
        System.out.println(string2.toLowerCase());
        // all white space will cut
        System.out.println("\t Good Night \n".trim());

    }
}
