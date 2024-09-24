
class Employees{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;

    }
    public void setname(String n){
        name = n;
    }
}
    class cellphone{
        public void ringing(){
            System.out.println("ringing...");
        }
        public void vibrating(){
            System.out.println("vibrating...");
        }
        public void callfriend(){
            System.out.println("call my friend...");
        }
    }
    class square{
        int side; 
        
        public int calculatingarea(){
            int area = side*side;
            return area;
        }
        public int calculatingperimeter(){
            int perimeter = 4*side;
            return perimeter;
        }
    }



public class customclass {




    public static void main(String[] args) {
       /* 
        // problem 1
        Employees satyajit = new Employees(); 
        satyajit.setname("satyajit mohanty");
        satyajit.salary=23000;
        System.out.println(satyajit.getname());
        System.out.println(satyajit.getsalary());


        // problem 2
        cellphone iphone = new cellphone();
        iphone.ringing();
        iphone.callfriend();
        iphone.vibrating();
        */

        //  problem 3

        square abcd = new square();
        abcd.side=5;
        System.out.println(abcd.calculatingarea());
        System.out.println(abcd.calculatingperimeter()); 


        
    }
    
}
