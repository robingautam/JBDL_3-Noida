package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

    //    List<Integer> ans = new ArrayList<>();

     /*   for (int i=0;i<list.size();i++){
            int val = list.get(i);
            if (val%2==0){
                ans.add(val);
            }
        }*/

    //    System.out.println(ans);
// filter and map
    //   List<Integer> ans = list.stream().filter((i)-> i%2==0).map(i->i*i).collect(Collectors.toList());
    //    System.out.println(ans);

        list.add(1);
        list.add(1);
        // sorted
     //  List<Integer> ans = list.stream().sorted().collect(Collectors.toList());
     //   System.out.println(ans);

        // distinct

      //  List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
     //   System.out.println(ans);

        // map
     //  List<Integer> ans = list.stream().map(i->i*i).collect(Collectors.toList());
     //   System.out.println(ans);

        //list.stream().map(i->i*i).flatMap(i->i*i).collect(Collectors.toList())

      //  System.out.println(list.stream().allMatch(i->i%2==0));

        System.out.println(list.stream().findAny().get());

    }
}

class predicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}
