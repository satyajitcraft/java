

class base{
    int x;
    public base(){
       System.out.println("i am a constructor.");
    }
    public base(int x){
        System.out.println("i am an overloading constructor of value "+x);
     }

    public void setX(int x) {
        this.x = x;
    } 
    public int getX() {
        return x;
    }
}
class derived extends base{
    int y;
    
    public derived(){
        //super(0);
        System.out.println("i am a derived class constructor.");
    }
    public derived(int x, int y){
        super(x);
        System.out.println("i am a derived class overloading constructor with value of y is  "+y);
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
class childofderived extends derived{
    public childofderived(int x,int y,int z){
        super(x,y);
        System.out.println(" i m childofderived class overloading constructor with value of z is "+z);

    }
}
public class constructors_in_inheritance {

    public static void main(String[] args) {
        //base b = new base();
        childofderived d = new childofderived(14,6,9);
        
    }
    
}
