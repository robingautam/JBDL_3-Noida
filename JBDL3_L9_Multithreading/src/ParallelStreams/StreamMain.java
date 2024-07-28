package ParallelStreams;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        for (long i=1;i<=90000;i++){
            list.add(i);
        }
        long startTime = System.currentTimeMillis();
        long ans = list.stream().reduce((i1,i2)->i1+i2).get();
        long endTime = System.currentTimeMillis();

        long diff = endTime-startTime;

        System.out.println("Time: "+diff);

        System.out.println(ans);


        long startTime2 = System.currentTimeMillis();

        long pans = list.parallelStream().reduce((i1,i2)->i1+i2).get();

        long endTime2 = System.currentTimeMillis();

        long diff2 = endTime2-startTime2;

        System.out.println("Time: "+diff2);

        System.out.println(pans);
    }
}
