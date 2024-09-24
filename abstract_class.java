

abstract class parent2{
    public parent2(){
        System.out.println(" i m the constructor of parent2.");
    }
    public void hello(){
        System.out.println("Hello!!!");
    }
    abstract public void greet();
    abstract public void greet2();
    
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }


}
abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am good.");
    }
}

public class abstract_class {

    public static void main(String[] args) {
        
        child2 c = new child2();
        //  parent2 p = new parent2();  // not  allowed as object cannot be created for abstract class
        //child3 c3 = new child3();   // not  allowed as object cannot be created for abstract class
    }
    
}
