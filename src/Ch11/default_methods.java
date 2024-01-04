package Ch11;

interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling", phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..........");
    }
    void takeSnap(){
        System.out.println("Taking Snap");
    }
}
public class default_methods{

}