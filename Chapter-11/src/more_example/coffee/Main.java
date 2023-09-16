package more_example.coffee;

class Liquid {
    public void swirl (boolean clockwise) {
        System.out.println("Swairling liquid . . .");
    }
}

class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swarling Coffee . . . ");
    }
}

class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swairling Milk . . .");
    }
}

class CoffeCup {
    private Liquid innerLiquid;
    public void addLiquid (Liquid liquid) {
        innerLiquid = liquid;
        innerLiquid.swirl(false);
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeCup myCup = new CoffeCup();
        Liquid genericLiquid = new Liquid();
        Coffee coffee = new Coffee();
        Milk milk = new Milk();

        myCup.addLiquid(genericLiquid);
        myCup.addLiquid(coffee);
        myCup.addLiquid(milk);
    }
}
