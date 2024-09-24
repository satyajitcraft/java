
 class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is running.");
            Thread.sleep(2000); // Simulating some task
            System.out.println(name + " has completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Join_IsAliveExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Starting threads
        thread1.start();
        thread2.start();

        // Using join() to wait for threads to finish
        try {
            thread1.join(); // Main thread waits for thread1 to complete
            System.out.println("Thread 1 has finished.");
            thread2.join(); // Main thread waits for thread2 to complete
            System.out.println("Thread 2 has finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checking if threads are alive using isAlive()
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());

        System.out.println("Main thread finished.");
    }

   
}

