

class mymainemployee{
    private int id;
    private String name;
// constructor overloading.....
    public mymainemployee(String myname, int myid){
        id = myid;
        name = myname;

    }
    public mymainemployee(){
        id = 45;
        name = "yeah i am fine...";

    }
    public mymainemployee(String myname){
        id = 98;
        name = myname;

    }
    
    // upto here
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

public class constructors {

    public static void main(String[] args) {
        // mymainemployee satyajit = new mymainemployee("hey bro!! how are you???",267);
        mymainemployee satyajit = new mymainemployee("yeah constructor overloading is possible!!!");
        // satyajit.setname("satyajit mohanty");
        // satyajit.setid(235);
        System.out.println(satyajit.getname());
        System.out.println(satyajit.getid());
    }
    
}
