package more_examples.constructor;

class Student {
    String name;
    int id;
    float cgpa;
    // here using default constructor
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}

public class ConstructorTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sumon");
        student.setId(191220);
        student.setCgpa(3.29F);
    }
}
