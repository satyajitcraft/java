

class animal{
    String name;
    public void speak(String speak){
        this.name = speak;
        System.out.println(name);
    }
    public void walk(String walk){
        this.name = walk;
        System.out.println(name);
    }
}
class dog extends animal{
        public void bark(String bark){
            this.name = bark;
            System.out.println(name); 
        }
    }


public class inheritance {

    public static void main(String[] args) {

        dog tommy = new dog();
        tommy.speak("yes animals speak");
        tommy.walk("yes animals can walk and run");
    }
    
}
