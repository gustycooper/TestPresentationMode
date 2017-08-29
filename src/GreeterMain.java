/**
 * Created by gusty on 8/27/17.
 */
public class GreeterMain {
    private String greeter;

    public static String NICE_GREETER = "Katie";

    public GreeterMain(String g) {
        greeter = g;
    }

    public String sayHello() {
        return "Hello " + greeter;
    }

    public void setGreeter(String greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        GreeterMain gm = new GreeterMain("Hello");
        System.out.println(gm.sayHello());
        System.out.println(GreeterMain.NICE_GREETER);
    }
}
