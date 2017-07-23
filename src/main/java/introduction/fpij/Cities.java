package introduction.fpij;

import java.util.Arrays;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        imperativeSearch();
    }

    private static void imperativeSearch() {
        boolean found = false;
        List<String> cities = Arrays.asList("Madrid", "Chicago", "Barcelona", "London", "New York");

        for (String city : cities) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found Chicago? " + found);
    }
}
