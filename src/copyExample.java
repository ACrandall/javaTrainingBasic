import java.util.ArrayList;
import java.util.List;

/**
 * Created by acrandall on 3/4/2016.
 */
public class copyExample {
    public static void main(String[] args) {
        copyExample ourCopyExample = new copyExample();
        ourCopyExample.demonstrateShallowCopy();
        ourCopyExample.demonstrateDeepCopy();
    }

    public void demonstrateShallowCopy(){
        Doorknob a = new Doorknob(5, "Argyle");
        Doorknob b = new Doorknob(6, "Black Glass");
        Doorknob c = new Doorknob(1, "Ceramic");

        List<Doorknob> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);

        List<Doorknob> copiedList = shallowCopy(l);
        l.get(0).radius = 20;
        System.out.println("l radius of item 0: "+ l.get(0).radius);
        System.out.println("copy radius of item 0: "+ copiedList.get(0).radius);
        System.out.println("ShallowCopy");
        testEquality(l, copiedList);
    }

    public void demonstrateDeepCopy(){
        Doorknob a = new Doorknob(5, "Argyle");
        Doorknob b = new Doorknob(6, "Black Glass");
        Doorknob c = new Doorknob(1, "Ceramic");

        List<Doorknob> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);

        List<Doorknob> copiedList = deepCopy(l);
        l.get(0).radius = 20;
        System.out.println("l radius of item 0:"+ l.get(0).radius);
        System.out.println("copy radius of item 0:"+ copiedList.get(0).radius);
        System.out.println("DeepCopy");
        testEquality(l, copiedList);
    }

    private List<Doorknob> deepCopy(List<Doorknob> l) {
        List<Doorknob> returnList = new ArrayList<>();
        for (Doorknob doorknob: l){
            returnList.add(new Doorknob(doorknob));
        }
        return returnList;
    }


    public List<Doorknob> shallowCopy(List<Doorknob> l){
        List<Doorknob> returnList = new ArrayList<>();
        for (Doorknob doorknob: l){
            returnList.add(doorknob);
        }
        return returnList;
    }

    private void testEquality(List<Doorknob> listA, List<Doorknob> listB) {
        if(listB == listA){
            System.out.println("Lists are the same object");
        }else{
            System.out.println("Lists are not the same object");
        }

        if(listB.equals(listA)){
            System.out.println("Lists have the same objects");
        }else{
            System.out.println("Lists have different objects");
        }
    }
}
