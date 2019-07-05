package executor_framework;

import java.util.Random;
import java.util.concurrent.Callable;

/*
This class should simulate long-running operation
 */
public class IntegerGenerator implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("thread started: " + Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("thread ended: " + Thread.currentThread().getName());
        return new Random().nextInt(100);
    }
}
