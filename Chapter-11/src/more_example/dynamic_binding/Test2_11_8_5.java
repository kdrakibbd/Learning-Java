package more_example.dynamic_binding;

class Person {
    //public or private
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}

class Student extends Person {

    private String getInfo() {
        return "Student";
    }
}

class Test2_11_8_5 {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}
