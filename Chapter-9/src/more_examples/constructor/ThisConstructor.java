package more_examples.constructor;

class B {
    int a;
    int b;

    public B () {
        this(1,2);
    }

    public B(int a, int b) {
        this.a = a;
        this.b = b;
    }


}

public class ThisConstructor {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a + " " + b.b);
    }
}
