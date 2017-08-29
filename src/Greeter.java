/**
 * Created by gusty on 8/27/17.
 */
public class Greeter {
    private String greeter;

    public Greeter(String g) {
        greeter = g;
    }

    public String sayHello() {
        return "Hello " + greeter;
    }

    public void setGreeter(String greeter) {
        this.greeter = greeter;
    }
}
