/**
 * Created by acrandall on 2/19/2016.
 */
public class Door {
    int height;
    int width;
    int area;
    String material = "Oak";
    Doorknob myDoorknob = new Doorknob();

    public Door(){
        this.height = 2;
        this.width = 2;
        this.material = "Paper";
        this.area = 4;
    }

    public Door(int myHeight, int myWidth){
        this.height = myHeight;
        this.width = myWidth;
        this.area = myHeight * myWidth;
    }

    public Door(int height, int width, String material){
        this.height = height;
        this.width = width;
        this.area = this.height * this.width;
        this.material = material;
    }

    public Door(Door aDoor) {
        height = aDoor.height;
        width = aDoor.width;
        area = aDoor.area;
        material = aDoor.material;
        myDoorknob = new Doorknob(aDoor.myDoorknob);
    }

    public static void main(String[] args) {
//        Door doors = new Door(7,4,"Steel");
        Door myDoor = new Door();

        System.out.println(myDoor.height);
        System.out.println(myDoor.width);
        System.out.println(myDoor.area);
        System.out.println(myDoor.material);

    }
}
