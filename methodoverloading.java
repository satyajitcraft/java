

public class methodoverloading { 

    static void change1(int a){
        a=98;
    }
    static void change2(int [] myarray){
       myarray[0]=78;

    }
    static void satya(){
        System.out.println("good morning bro!!");
    }
    static void satya(int a){
        System.out.println("good morning " +a+ " bro!!!");
    }
    static void satya(int a,int b){
        System.out.println("good morning " +a+ " bro!!!");
        System.out.println("good morning " +b+ " bro!!!");
    }
    


    public static void main(String[] args) {
        // changing a integer
        
        // int x= 54;
        // change1(x);
        // System.out.println("the value of x after running change1 is: "+x );

        //changing a Array
        // int [] y ={23,87,56,34,10,90};
        // change2(y);
        // System.out.println("the value of array afer running change2 is: "+y[0]);
        

        // method overloading

        satya();
        satya(3000);
        satya(400,500);

        //arguments are actual value like 400 and 500 but parameters are int a and int b in methods


    }
    
}
