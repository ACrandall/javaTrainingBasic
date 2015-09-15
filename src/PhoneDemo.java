/**
 * Created by Adam Crandall on 9/8/2015.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.printSpecs();
        System.out.println("My phone really is " + myPhone.getColor());
        myPhone.setColor("Red");
        myPhone.setRingtone("Riot");
        myPhone.printSpecs();
    }
}
