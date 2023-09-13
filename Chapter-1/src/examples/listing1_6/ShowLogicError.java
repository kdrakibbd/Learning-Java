package examples.listing1_6;

public class ShowLogicError {
    public static void main(String[] args) {
        System.out.print("Celsius 35 is Fahrenheit degree : ");
        //here take the interger value
        System.out.println((9 / 5) * 35 + 32);

        System.out.print("Celsius 35 is Fahrenheit degree : ");
        //here will be floating value
        System.out.println((9.0 / 5) * 35 + 32);
    }
}
