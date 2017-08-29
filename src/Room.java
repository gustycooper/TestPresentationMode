/**
 * Created by gusty on 8/27/17.
 */
public class Room {
    String building;
    int roomNumber;
    int numberOfSeats;

    public Room(String b, int rn, int nos) {
        building = b;
        roomNumber = rn;
        numberOfSeats = nos;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
