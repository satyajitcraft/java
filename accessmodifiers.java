

class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        this.name = n;

    }
    public String getname(){
        return name;
    }
    public void setid(int x){
        this.id = x;
    }
    public int getid(){
        return id;
    }

     

}

public class accessmodifiers {

    public static void main(String[] args) {
        
        myemployee satyajit = new myemployee();
        // satyajit.id = 233;
        // satyajit.name = "satyajit mohanty"; ---> throws error due to use of private access modifier.

        satyajit.setname("satyajit mohanty");
        System.out.println(satyajit.getname());
        satyajit.setid(234);
        System.out.println(satyajit.getid());

        
    }
    
}
