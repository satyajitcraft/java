

interface bicycle{
    int a = 45;
    public int applybrake(int decrement);
    public int speedup(int increment);

}
interface hornbicycle{
    public void blowhorn1();
    public void blowhorn2();
}
class Avoncycle implements bicycle,hornbicycle{
    int speed =7;
    public int applybrake(int decrement){
        speed = speed - decrement;
        System.out.print("the deacclerated speed is ");
        return speed;
    }
    public int speedup(int increment){
       speed = speed + increment;
       System.out.print("the accelerated speed is ");
       return speed;
    }
    public void blowhorn1(){
        System.out.println("pee pee pooo pooo.....");
    }
    public void blowhorn2(){
        System.out.println("kabhi khushi kabhi pee pooo peee....");
    }

}

public class interfaces {

    public static void main(String[] args) {
        Avoncycle cycle_satya = new Avoncycle();
        //cycle_satya.speed=10;
        System.out.println(cycle_satya.applybrake(2));
        System.out.println(cycle_satya.speedup(2));
        // you can create properties in interfaces
        System.out.println(cycle_satya.a);
        // but you cannot change properties in interface as they are final
        //cycle_satya.a=567;  // Error
        cycle_satya.blowhorn1();
        cycle_satya.blowhorn2();

        
    }
    
}
