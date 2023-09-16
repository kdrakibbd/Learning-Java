package more_example.string;

public class StringClass {
    public static void main(String[] args) {
        String string = "Welcome";

        // replace
        System.out.println(string.replace("e", "A")); // replace e by A
        System.out.println(string); // no change main string
        System.out.println(string.replaceFirst("e", "AB"));
        System.out.println(string.replace("e", "AB")); // only first e will be reaplace
        System.out.println(string.replace("el", "AB"));
        System.out.println();

        // split
        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println();

        //Conversion between Strings and Arrays
        char [] chars = "java".toCharArray();
        System.out.println(chars);
        System.out.println();

        // getChars
        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4); // take 3720, dst er 4 e bosaye dicche
        System.out.println(dst);

        // char to string
        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        char[] chars1 = {'a', 'b', 'c'};
        String str2 = new String(chars1);
        System.out.println(str2);

        String str3 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str3);

        String s = new String();
        System.out.println(s.length()); // 0

        // . * + [ ]
        "Welcome.to,java".replaceAll("\\.", "");
    }
}
