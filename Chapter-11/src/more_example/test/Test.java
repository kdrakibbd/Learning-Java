package more_example.test;

class A {
    public A() {
        System.out.println( "A's no-arg constructor is invoked");
    }
}
class B extends A {
    B () {
        // super()
    }
}
class C {
    public static void main(String[] args) {
        B b = new B();
    }
}