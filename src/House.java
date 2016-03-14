import java.util.ArrayList;
import java.util.List;

/**
 * Created by acrandall on 2/8/2016.
 */
public class House {
    String color;
    int address = 1234_5678_91;
    List<Door> doors = new ArrayList<>();

    public House(String myColor, int myAddress) {

        color = myColor;
        address = myAddress;
    }

    public House(String myColor, int myAddress, List<Door> myDoors) {
        color = myColor;
        address = myAddress;
        for (Door aDoor : myDoors) {
            myDoors.add(new Door(aDoor));
        }
    }

    public static void main(String[] args) {
        House aHouse;
        aHouse = new House("Red", 1234);
        House bHouse = new House("Blue", 1234);
        House cHouse = new House("Red", 2335);
        cHouse.address = 3456;
        House dHouse = new House("Blue", 2345);

        System.out.println("aHouse's Color is " + aHouse.color);
        System.out.println("aHouse's Address is " + aHouse.address);
        System.out.println(bHouse);
        System.out.println(cHouse);
        System.out.println(dHouse);

        List<Door> theseDoors = new ArrayList<>();
        theseDoors.add(new Door());
        theseDoors.add(new Door(4, 7));
        dHouse.doors = theseDoors;

        System.out.println(dHouse.doors.get(1).myDoorknob.material);
    }

    public List<Door> getDoors() {
        return doors;
    }

    private void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public String toString() {
        return "Address = " + address + "\n Color = " + color;
    }
}
