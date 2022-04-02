package MazeConcreteObjects;

import java.util.ArrayList;
import java.util.List;

/*
 * one room will have 4 doors and depending on layout we are going to assign doors to a room
 * For Layout 1 we will be assigning doors in random fashionm
 * */
public class Room {


    List<Room> rooms;

    public Room() {
    }

    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms) {
        List<Room> _rLst = new ArrayList<>();
        for (int i = 0; i < numberOfRooms * numberOfRooms; i++) {
            Room _r = new Room();
            _rLst.add(_r);
        }
        return _rLst;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
