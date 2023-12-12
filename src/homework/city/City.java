package homework.city;

import java.util.Arrays;

public class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    @Override
    public String toString() {

        return "City ("
                + "name " + name
                + ", houses: " + Arrays.toString(houses)
                + ')';
    }

    public House[] getHouses() {
        return houses;
    }
}
