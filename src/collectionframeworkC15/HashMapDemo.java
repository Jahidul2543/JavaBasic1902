package collectionframeworkC15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Midul");
        map.put(2, "T");
        map.put(3, "Akter");
        map.put(4, "Hossain");

        for(Map.Entry<Integer, String> e : map.entrySet()){

            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}
