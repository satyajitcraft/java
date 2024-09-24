

class Threadrunnable1 implements Runnable{
    public void run(){
        for (int index = 0; index < 1000; index++) {
            System.out.println("hi i am thread 1 not threat 1...");
            
        }
    }
    }
    class Threadrunnable2 implements Runnable{
        public void run(){
            for (int index = 0; index < 1000; index++) {
                System.out.println("hi i am thread 2 not threat 2...");
                
            }
        }
        }


public class runnable_thread {

    public static void main(String[] args) {

        Threadrunnable1 bullet1 = new Threadrunnable1();
        Thread gun1 = new Thread(bullet1);
        Threadrunnable2 bullet2 = new Threadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        
    }
    
}
