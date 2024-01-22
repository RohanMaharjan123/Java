package Ch11;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println(phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..........");
    }
    void takeSnap(){
        System.out.println("Taking Snap");
    }
}
class MySmartPhone extends MyCellphone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Snap");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networksList = {"CN", "RN", "MIS"};
        return networksList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
}
public class default_methods{
    public static void main(String[] args) {
        MySmartPhone  ms =  new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}