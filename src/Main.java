import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<City> cities = new ArrayList<City>();
        cities.add(new City("Praha", 1500000));
        cities.add(new City("Brno", 500000));

        Collections.sort(cities,Collections.reverseOrder());

        System.out.println(cities);
    }
}