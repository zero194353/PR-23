import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> names = new HashMap<>();
        int counter = 0;
        ArrayList<String> keysToDelete = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String key = in.next();
            String value = in.next();
            names.put(key, value);
        }

        for (String key : names.keySet()) {
            for (String value : names.values()) {
                if (names.get(key).compareTo(value) == 0) {
                    keysToDelete.add(key);
                    counter++;
                }
            }

            if (counter == 1) {
                keysToDelete.remove(keysToDelete.size() - 1);
            }
            counter = 0;
        }


        for (String keyToDelete : keysToDelete) {
            names.remove(keyToDelete);
        }

        for (String key : names.keySet()) {
            System.out.println(key + " " + names.get(key));
        }

    }
}
