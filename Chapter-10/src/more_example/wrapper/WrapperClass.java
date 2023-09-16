package more_example.wrapper;

import java.lang.*;
import java.math.*;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("The maximum integer is : "+ Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " + Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);

        Double d = Double.valueOf(45.5);
        System.out.println(d.intValue());
        System.out.println(d);
        int i = (Integer.valueOf("23")).intValue();

        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));

        System.out.println();

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));

        int iii = new Integer(1) ;

        Integer xx = 5;

        x(6);

        Integer x1 = 3 + new Integer(5);
        System.out.println(x1);

        Double x2 = 3.5;
        System.out.println(x2.intValue());
        System.out.println(x2.compareTo(4.5));

        System.out.println();

        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        System.out.println(c);

        System.out.println();

        BigDecimal aa = new BigDecimal(1.0);
        BigDecimal bb = new BigDecimal(3);
        BigDecimal cc = aa.divide(bb, 20, BigDecimal.ROUND_DOWN);
        System.out.println(cc);
    }

    static void x(Object v) {

    }
}
