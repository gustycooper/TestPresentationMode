/**
 * Created by gusty on 8/28/17.
 */
public class RoomTester {
    public static void main(String[] args) {
        Room r = new Room("Trinkle", 6, 25);
        System.out.println(r.getBuilding() + " Room num: " + r.roomNumber + " Seats: " + r.numberOfSeats);
    }
}