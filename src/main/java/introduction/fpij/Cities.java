package introduction.fpij;

import java.util.Arrays;
import java.util.List;

public class Cities {

    public static final List<String> CITIES = Arrays.asList("Madrid", "Chicago", "Barcelona", "London", "New York");

    public static void main(String[] args) {
        imperativeSearch();
        declarativeSearch();
    }

    private static void declarativeSearch() {
        System.out.println("Declarative: ");
        System.out.println("Found chicago? " + CITIES.contains("Chicago"));
    }

    private static void imperativeSearch() {
        System.out.println("Imperative: ");
        boolean found = false;

        for (String city : CITIES) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found Chicago? " + found);
    }
}
