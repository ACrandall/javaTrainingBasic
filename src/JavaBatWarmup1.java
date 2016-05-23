/**
 * Created by acrandall on 5/23/2016.
 */
public class JavaBatWarmup1 {
    public static void main(String[] args) {
        JavaBatWarmup1 test = new JavaBatWarmup1();

        System.out.println("SLEEP IN");
        boolean boolResult = test.sleepIn(true, true);
        System.out.println(test.sleepIn(false, false));
        System.out.println(test.sleepIn(true, false));
        System.out.println(test.sleepIn(false, true));
        System.out.println(boolResult);

        System.out.println("MONKEY TROUBLE");
        System.out.println(test.monkeyTrouble(true, true)); //true
        System.out.println(test.monkeyTrouble(true, false)); //false
        System.out.println(test.monkeyTrouble(false, true)); //false
        System.out.println(test.monkeyTrouble(false, false)); //true
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return (aSmile && bSmile) || (!aSmile && !bSmile);


//        if (aSmile && bSmile) return true;
//        else if (!aSmile && !bSmile) return true;
//        else return false;
    }

    public boolean sleepIn (boolean weekday, boolean vacation){
//        return !(weekday && !vacation);
        return !weekday || vacation;
//        boolean canSleepIn;
//        if (weekday && !vacation)
//            canSleepIn = false;
//        else canSleepIn = true;
//
//        return canSleepIn;
    }
}
