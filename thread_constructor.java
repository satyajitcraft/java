

class MyTh extends Thread{
    public MyTh(String name){
        super(name);

    }
    public void run(){
        System.out.println("thank you...");
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyTh T1 = new MyTh("satyajit");
        MyTh T2 = new MyTh("biswajit");
        T1.start();
        T2.start();
        System.out.println("the name of thread T1 is " +T1.getName());
        System.out.println("the id of thread T1 is " +T1.getId());
        System.out.println("the name of thread T2 is " +T2.getName()); 
        System.out.println("the id of thread T2 is " +T2.getId());   
    }
}
