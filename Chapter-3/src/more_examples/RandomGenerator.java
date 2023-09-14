package more_examples;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        int randomNumber;

        randomNumber = (int) (Math.random() * 20); // 0-->20
        System.out.println("randomNumber is : " + randomNumber);

        randomNumber = (int) ((Math.random() * 10) + 10); //10-->20
        System.out.println("randomNumber is : " + randomNumber);

        Random random = new Random();
        int min = 10;
        int max = 20;
        randomNumber = random.nextInt(max - min + 1) + min; // 10-20
        System.out.println(randomNumber);

    }
}
