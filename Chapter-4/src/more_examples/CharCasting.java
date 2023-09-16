package more_examples;

public class CharCasting {
    public static void main(String[] args) {
        char ch = (char) 0XAB0041; // the lower 16 bit hex code 0041 and assign to char
        System.out.println(ch); // ch is A

        ch = (char) 65.23;
        System.out.println(ch);

        // implicit casting
        byte b = 'a';
        int i = 'a';
        System.out.println(b + " " + i);

        //explicit casting
        byte bt = (byte) '\uFFF4';
        System.out.println(bt); // -12 F4 overflow

        int il = '2' + '3'; //(int)'2' is 50 and (int)'3' is 51
        System.out.println("i is : " + i);
        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("J is : " + j);

        System.out.println(j + " is the Unicode for charecter " + (char) j); // j is c
        System.out.println("Chaper "+ '2');



    }
}
