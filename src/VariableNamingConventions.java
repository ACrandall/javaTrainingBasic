/**
 * Basics of declaring and initializing variables.
 * Created by Adam Crandall on 9/9/2015.
 */
public class VariableNamingConventions {
    int intVariable;
    String myString = "My String Rocks";

    public static void main(String[] args) {
        VariableNamingConventions vnc = new VariableNamingConventions();
        System.out.println("myString = " + vnc.myString + "\n" + "intVariable = " + vnc.intVariable);
        String myLocalString = "";
        System.out.println("myLocalString = " + myLocalString);

        int result = 1 + 2;
        System.out.println(result);

        result -= 1;
        System.out.println(result);

        result *= 2;
        System.out.println(result);

        result /= 2;
        System.out.println(result);

        result += 8;
        result %= 7;
        System.out.println(result);

    }

}
