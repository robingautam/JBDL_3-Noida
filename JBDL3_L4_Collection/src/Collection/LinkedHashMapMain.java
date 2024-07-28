package Collection;

import javax.print.DocFlavor;
import java.util.*;

public class LinkedHashMapMain {

    public static void main(String[] args) {
       /* TreeMap<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.put("aakash",1);
        treeMap.put("Robin", 2);

        for (String keys: treeMap.keySet()){
            System.out.println(keys);
        }*/

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(4);
        }
    }
}
