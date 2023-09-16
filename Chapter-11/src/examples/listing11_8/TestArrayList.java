package examples.listing11_8;

import examples.listing11_5.Circle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // Contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // Contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.println("List size : "+cityList.size());
        System.out.println("Is miami in the list ? "+cityList.contains("Miami"));
        System.out.println("The location of the denver in the list : "+cityList.indexOf("Denver"));
        System.out.println("Is the list emty ? "+ cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Xian");
        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        cityList.remove("Miami");
        // Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        cityList.remove(1);
        // Contains [London, Xian, Paris, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList.toString());

        // reverse order display list
        for (int i = cityList.size()-1;i >= 0;i--) {
            System.out.println(cityList.get(i) +" ");
        }
        System.out.println();

        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));

        System.out.println("The area of the circle is : "+list.get(0).getArea());

    }
}
