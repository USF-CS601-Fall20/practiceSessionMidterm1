package solution.question5;

/** Solution to the LockExample problem */
public class LockExample {
    private Thread worker;
    private static int x = 0;
    // Create a lock
    private static Object lock = new Object();

    public LockExample() {
        // Create and start the worker
        this.worker = new Worker(lock);
    }

    /** Nested class Worker */
    private class Worker extends Thread {
        private Object lock;
        public Worker(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized(lock) {
                for (int i = 0; i < 1000; i++)
                    x++;
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        LockExample demoA = new LockExample();
        LockExample demoB = new LockExample();

        // Workers in demoA and demoB will not be able to execute the synchronized block of code
        // concurrently, since they share the same lock.
        // This is because the lock is static, and static variables are shared
        // by all instances of the class.
    }
}


