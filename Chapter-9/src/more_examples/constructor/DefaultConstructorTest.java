package more_examples.constructor;

class  A {
    String s = "Hi sumon";

    public A(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(s);
    }
}

public class DefaultConstructorTest  {
    public static void main(String[] args) {
        A a = new A("");
        a.print();
    }
}
