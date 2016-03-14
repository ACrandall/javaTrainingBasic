/**
 * Created by acrandall on 2/24/2016.
 */
public class Doorknob {//class
    double radius;
    String material;

    public Doorknob(){// no arg constructor or default constructor
        radius = 2;
        material = "Glass";
    }

    public Doorknob(double radius, String material){//constructor or parameterized constructor
        this.radius = radius;
        this.material = material;
    }

    public Doorknob(Doorknob myDoorKnob){//copy constructor
        this.radius = myDoorKnob.radius; //this Doorknobs radius is the same as myDoorknobs radius
        this.material = myDoorKnob.material; //this Doorknobs material is the same as myDoorknobs material
    }
}
