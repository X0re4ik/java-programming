package lr3;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "вапвпа");
        map.put(1, "фаацк3цекп");
        map.put(2, "латплвадп");
        map.put(3, "вапвап");
        map.put(4, "вапвап");
        map.put(5, "Пять");
        map.put(6, "вапвап");
        map.put(7, "вапвп");
        map.put(8, "вап");
        map.put(9, "ываыва");
        map.put(10, "цукцук");

        String result = "";
        int product = 1;

        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key));
            } else if (key == 0) {
                result = String.join(", ", map.values());
            }

            if (map.get(key).length() > 5) {
                product *= key;
            }
        }

        System.out.println("Результат: " + result);
        System.out.println("Произведение ключей с длиной строки больше 5: " + product);
    }
}

