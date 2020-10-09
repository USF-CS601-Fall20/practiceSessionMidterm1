package solution.question6;

import java.util.concurrent.TimeUnit;

/* Solution to Question 6 */
public class VolatileExample {
    private volatile boolean flag;

    private class Worker1 implements Runnable {
        @Override
        public void run() {
            while (!flag) {
                System.out.println(Thread.currentThread().getName() + ": Busy waiting...");
            }
            System.out.println(Thread.currentThread().getName() + ": Finally, the flag is true!");
        }
    }

    private class Worker2 implements Runnable {

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
            flag = true;
            System.out.println(Thread.currentThread().getName() + ": I set the flag to true");
        }
    }
    public static void main (String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        Thread thread1 = new Thread(volatileExample.new Worker1());
        thread1.start();

        Thread thread2 = new Thread(volatileExample.new Worker2());
        thread2.start();

    }
}
