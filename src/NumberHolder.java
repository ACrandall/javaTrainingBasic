/**
 * Created by acrandall on 2/8/2016.
 */
public class NumberHolder {
    public int anInt =0;
    public float aFloat =0f;

    public NumberHolder(){
        anInt = 4;
        aFloat = 5.555555f;
    }

//    public NumberHolder(int anInt){
//        this.anInt = anInt;
//    }

    public NumberHolder(float aFloat){
        this.aFloat = aFloat;
    }

    public NumberHolder(int anInt, float aFloat){
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public String toString(){
        return "The anInt =" + anInt + " The aFloat =" + aFloat;
    }

    public static void main(String[] args) {
        NumberHolder ourNumberHolder;
        ourNumberHolder = new NumberHolder();
        NumberHolder ourSecondNumberHolder = new NumberHolder(3,4.44444f);
        NumberHolder defaultFun = new NumberHolder(1);
        NumberHolder wtf = new NumberHolder(3.0f);

        System.out.println("The anInt =" + ourNumberHolder.anInt + " The aFloat =" + ourNumberHolder.aFloat);
//        System.out.println(ourNumberHolder.toString());
        System.out.println(ourSecondNumberHolder);

        System.out.println(defaultFun);
        System.out.println(wtf);
    }
}
