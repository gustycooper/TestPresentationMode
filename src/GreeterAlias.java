/**
 * Created by gusty on 8/30/17.
 */
public class GreeterAlias {
    public static void main(String[] args) {
        Greeter g1 = new Greeter("World");
        Greeter g2 = g1;
        g2.setGreeter("Gusty");
        System.out.println("g1.sayHello() is " + g1.sayHello());
        System.out.println("g2.sayHello() is " + g2.sayHello());
    }
}
