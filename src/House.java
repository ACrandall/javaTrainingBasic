/**
 * Created by acrandall on 2/8/2016.
 */
public class House {
    String color = "red";
    int address = 1234;
    Door[] myDoor = new Door[4];

    public House(){}

    public House(int myAddress){
        this.address = myAddress;
    }

    public House(String myColor){
        this.color = myColor;
    }

    public House(int myAddress,String myColor){
        this.address = myAddress;
        this.color = myColor;
    }

    public House(String myColor, int myAddress){
        color = myColor;
        address = myAddress;
    }

    public House(String myColor, int myAddress, Door[] myDoors){
        color = myColor;
        address = myAddress;
        myDoor = myDoors.clone();
    }

    public String toString(){
        return "Address = " + address + "\n Color = " + color;
    }

    public static void main(String[] args) {
        House aHouse;
        aHouse = new House();
        House bHouse = new House(1234);
        House cHouse = new House("Red");
        cHouse.address = 3456;
        House dHouse = new House(2345,"Blue");

        System.out.println("aHouse's Color is " + aHouse.color);
        System.out.println("aHouse's Address is " + aHouse.address);
        System.out.println(bHouse);
        System.out.println(cHouse);
        System.out.println(dHouse);

        dHouse.myDoor[0] = new Door();
        dHouse.myDoor[1] = new Door(4,7);

        System.out.println(dHouse.myDoor[0].myDoorknob.material);
    }
}
