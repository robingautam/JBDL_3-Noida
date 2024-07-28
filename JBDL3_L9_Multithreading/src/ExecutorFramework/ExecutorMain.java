package ExecutorFramework;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorMain {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 4, TimeUnit.HOURS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i=1;i<=8;i++){
            threadPoolExecutor.execute(()->{
                System.out.println("Executing Task: by Thread: "+Thread.currentThread().getName());
            });
        }


    }
}
