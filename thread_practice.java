
 class MyThread extends Thread{
    public void run(){
        System.out.println("hello world!!!");
    }
 }
public class thread_practice {
    public static void main(String[] args) {
        MyThread T1 = new MyThread();
        T1.start();
    }
    
}
