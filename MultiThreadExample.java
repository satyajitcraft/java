
class DisplayTask implements Runnable {
    private String message;
    private int interval;

    public DisplayTask(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadExample {

    public static void main(String[] args) {
        // Creating instances of the runnables
        Runnable task1 = new DisplayTask("Thread 1 - Displaying every 2 seconds", 2000);
        Runnable task2 = new DisplayTask("Thread 2 - Displaying every 5 seconds", 5000);

        // Creating threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting threads
        thread1.start();
        thread2.start();
    }


   
}

