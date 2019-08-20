package collectionframeworkC15;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        /**
         * no duplicate
         * can store null
         * */

        Set<String> set = new HashSet<>();
        set.add("Midul");
        set.add("Midul");
        set.add("Rahul");
        set.add("Nayem");
        set.add("Zahidul");
        set.add("Zahidul");
        set.add(null);


        for(String str : set){
            System.out.println(str);
        }
    }

}
