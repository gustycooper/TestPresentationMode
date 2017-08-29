/**
 * Created by gusty on 8/28/17.
 */
public class RoomTester {
    public static void main(String[] args) {
        if (args.length > 0)
            System.out.println(args[0]);
        if (args.length > 1)
            System.out.println(args[1]);
        if (args.length > 2)
            System.out.println(args[2]);
        Room r = new Room("Trinkle", 6, 25);
        System.out.println(r.getBuilding() + " Room num: " + r.roomNumber + " Seats: " + r.numberOfSeats);
    }
}