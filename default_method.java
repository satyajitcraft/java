

interface MyCamera{
    void takesnap();
    void recordvideo();
    // default void record_video_in_4k(){
    //     System.out.println("recording video in 4K...");
    // } 
}
interface MyWifi{
    String[] getnetwork();
    void setnetwork(String network);

}
class MyCellphone{
    public void callnumber(int phonenumber){
        System.out.println("calling..." +phonenumber);
    }
    public void pickcall(){
        System.out.println("connecting...");
    }
    
}
class Smartphone extends MyCellphone implements MyCamera, MyWifi{

    public void takesnap(){
        System.out.println("Clicking a photo...");
    }
    public void recordvideo(){
        System.out.println("Starting to record HDR video....");
    }
    public String[] getnetwork(){
        System.out.println("Searching for additional network may take some time...");
        String[] networklist = {"Airtel","Jio","Vodafone","BSNL","MTNL"};
        return networklist;
    }
    
    public void setnetwork(String network){
        System.out.println("setting up network "+ network);

    }
}



public class default_method {

    public static void main(String[] args) {

        Smartphone Iphone = new Smartphone();
        // String[] available_network = Iphone.getnetwork();
        // System.out.println("avilable network...");
        // for (String network : available_network) {
        //     System.out.println(network);
            
        // }
        Iphone.recordvideo();

        
    }
    
}


