/**
 * Created by acrandall on 9/8/2015.
 */
public class Phone implements PhoneInterface{
    private String color = "Black";
    private String ringtone;

    public void setColor(String myColor){
        color = myColor;
    }

    public String getColor(){
        return color;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public void printSpecs(){
        System.out.println("color: " + color +
            " ringtone: " + getRingtone());
    }


    @Override
    public void ring() {

    }
}
