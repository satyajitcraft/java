
class EvenOddRunnable implements Runnable {
    private int start;
    private int end;
    private boolean isEven;

    public EvenOddRunnable(int start, int end, boolean isEven) {
        this.start = start;
        this.end = end;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        String threadName = isEven ? "EvenThread" : "OddThread";
        System.out.println(threadName + " starts printing:");

        for (int i = start; i <= end; i++) {
            if ((i % 2 == 0 && isEven) || (i % 2 != 0 && !isEven)) {
                System.out.println(threadName + ": " + i);
            }
        }

        System.out.println(threadName + " ends printing.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two instances of EvenOddRunnable for even and odd numbers
        EvenOddRunnable evenRunnable = new EvenOddRunnable(1, 20, true);
        EvenOddRunnable oddRunnable = new EvenOddRunnable(1, 20, false);

        // Create two threads and start them
        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();
    }
}

