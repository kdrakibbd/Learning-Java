package more_examples;

public class VariableScope {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("hell");
            for (int j = 0; j < 5; i++) {
                System.out.println("Hello 2");
            }
        }
    }
}
