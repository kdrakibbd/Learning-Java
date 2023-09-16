package more_examples;

public class SubString {
    public static void main(String[] args) {

        // simple
        String messege = "Welcome to java";

        // substring(beginIndex, endIndex)
        String string = messege.substring(0, 11) + "HTML";
        System.out.println(string);

        // substring(beginIndex)
        String str = messege.substring(8);
        System.out.println(str);
    }
}
