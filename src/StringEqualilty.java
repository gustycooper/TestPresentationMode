/**
 * Created by gusty on 8/30/17.
 */
public class StringEqualilty {
    public static void main(String[] args) {
        String s = "CPSC 240";
        if (s.substring(1,3) == "PS")
            System.out.println("== of " + s.substring(1,3) + " equals " + "PS");
        else
            System.out.println("== of " + s.substring(1,3) + " does not equal " + "PS");
    }
}
