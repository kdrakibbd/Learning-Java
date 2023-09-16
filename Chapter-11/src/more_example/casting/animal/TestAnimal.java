package more_example.casting.animal;

class Animal {
    String animalName ;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void name(){
        System.out.println("Animal name is: "+this.animalName);
    }

    public void sound(String animalSound) {
        System.out.println("Animal sound is :  "+ animalSound);
    }
}

class Cow extends Animal {

    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void sound(String animalSound) {
        System.out.println(this.animalName + " sound is : " + animalSound);
    }
}

class Dog extends Animal {

    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void sound(String animalSound) {
        System.out.println(this.animalName + " sound is " + animalSound);
    }
}

class Cat extends Animal {

    public Cat(String animalName) {
        super(animalName);
    }

    void bark() {}

    @Override
    public void sound(String animalSound) {
        System.out.println("Work of " + this.animalName + " is " + animalSound);
    }
}

public class TestAnimal {
    public static void main(String[] args) {

        Animal animal = new Cat("Cute Cat");
        animal.sound("Mewau Mewau");

        Animal animal2 = new Dog("Tom");
        animal2.sound("Ghew Ghew");

        Animal animal3 = new Cow("Cute Cow");
        animal3.sound("Hamba Hamba");

        animal = new Dog("");
        m(new Dog(""));

    }

    static void m(Animal animal) {
        Animal x = new Animal("");
        Cat y = (Cat) x;

        if (animal instanceof Cat) {
            ((Cat) animal).bark();
            ((Cat) animal).bark();
            ((Cat) animal).bark();
            ((Cat) animal).bark();
        }
        else if (animal instanceof Dog) {

        }
    }
}
