

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);

    }
    public void run(){
        
        while (true) {
            System.out.println("thank you... " + this.getName());
        }
    }
}

public class thread_priorities {

    public static void main(String[] args) {
        MyThr1 T1 = new MyThr1("satyajit");
        MyThr1 T2 = new MyThr1("biswajit");
        MyThr1 T3 = new MyThr1("chitta");
        MyThr1 T4 = new MyThr1("pikun");
        MyThr1 T5 = new MyThr1("sumit");
        MyThr1 T6 = new MyThr1("naveen");
        
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.NORM_PRIORITY);
        T5.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
        T6.start();
        
    }
    
}
