

class phone{
    public void swagat(){
        System.out.println("you are welcome here...");
    }
    public void name(){
        System.out.println("my name is java in class Phone ");
    }
}
class smartphone extends phone{
    @Override
    public void name(){
        System.out.println("my name is java in class Smartphone");
    }
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}
public class dynamic_method_dispatch {

    public static void main(String[] args) {

        // phone Nokia = new phone(); // Allowed
        // smartphone Iphone= new smartphone(); // Allowed
        // Nokia.name();

        phone samsung = new smartphone(); // Allowed 
        // smartphone Nokia = new phone(); // Shows error Not Allowed
        samsung.name();
        samsung.swagat();
        // samsung.on(); // Shows Error because on class is not present in super class phone
        
    }
    
}
