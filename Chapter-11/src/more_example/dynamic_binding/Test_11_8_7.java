package more_example.dynamic_binding;

class A {
    int i = 7;
    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        System.out.println("i from B is " + i);
    }
    @Override
    public void setI(int i) {
        this.i = 3 * i;
    }
}

class Test1 {
    public static void main(String[] args) {
        new A(); // 14
        new B(); //
    }
}