package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) {

     /*   PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("aakash");
        queue.add("rob");
        queue.add("preet");

      //  System.out.println(queue);

        while (queue.size()>0){
            String data = queue.remove();
            System.out.print(data+" ");
        }*/


        // map implementation
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);

        // keyset
        for (char ch: map.keySet()){
            System.out.println(map.get(ch));
        }

        // entryset
       // map.entrySet();
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }


        System.out.println(map.getOrDefault('c',-1));


    }
}
