

class Thread1 extends Thread{

    public void run(){
        while (true) {
            System.out.println("my cooking thread is running.");
            System.out.println("i am Happy");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("my chatting thread is running.");
            System.out.println("i am sad");
            
        }
    }
}
public class thread_by_extending_class {

    public static void main(String[] args) {

            Thread1 T1 = new Thread1();
            Thread2 T2 = new Thread2();
            T1.start();
            T2.start();

        
    }
    
}
