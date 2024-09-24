

interface MyCamera {
    void takesnap();
    void recordvideo();
}

interface MyWifi {
    String[] getNetworks();
    void setNetwork(String network);
}

class MyCellphone {
    public void callNumber(int phoneNumber) {
        System.out.println("Calling..." + phoneNumber);
    }

    public void pickCall() {
        System.out.println("Connecting...");
    }
}

class Smartphone extends MyCellphone implements MyCamera, MyWifi {
    public void takesnap() {
        System.out.println("Clicking a photo...");
    }

    public void recordvideo() {
        System.out.println("Starting to record HDR video....");
    }

    public String[] getNetworks() {
        System.out.println("Searching for available networks...");
        String[] networkList = {"Airtel", "Jio", "Vodafone", "BSNL", "MTNL"};
        return networkList;
    }

    public void setNetwork(String network) {
        System.out.println("Setting up network: " + network);
        // Additional logic to actually set the network can be added here
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Smartphone iPhone = new Smartphone();
        String[] availableNetworks = iPhone.getNetworks();
        System.out.println("Available Networks:");
        for (String network : availableNetworks) {
            System.out.println(network);
        }
        iPhone.recordvideo();
    }
}

