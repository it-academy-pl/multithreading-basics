package executor_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMain {

    private ExecutorService pool;

    public static void main(String[] args) throws Exception {
        ExecutorMain main = new ExecutorMain();
        main.generateRandomNumbers();
    }

    private void generateRandomNumbers() throws Exception {

        Callable<Integer> worker = new IntegerGenerator();
        //no multithreading
/*        for (int i = 0; i < 5; i++) {
            System.out.println(worker.call());
        }*/

        pool = Executors.newCachedThreadPool();
        List<Future<Integer>> futureList = new ArrayList<>();
        for(int i = 0; i<6; i++) {
            futureList.add(pool.submit(worker));
        }

        for (Future future: futureList) {
            System.out.println(future.get());
        }



    }
}
