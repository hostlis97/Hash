import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        char ch;
        int max = 0;
        char maxCh = Character.MIN_VALUE;
        char minCh = Character.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxCh = key;
            }
            if (map.get(key) < min) {
                min = map.get(key);
                minCh = key;
            }
        }

        System.out.println("Чаще всего встречалась буква \"" + maxCh + "\"");
        System.out.println("Реже всего встречалась буква \"" + minCh + "\"");
    }
}
