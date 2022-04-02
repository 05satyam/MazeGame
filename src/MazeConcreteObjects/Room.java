package MazeConcreteObjects;

import java.util.ArrayList;
import java.util.List;

/*
 * one room will have 4 doors and depending on layout we are going to assign doors to a room
 * For Layout 1 we will be assigning doors in random fashionm
 * */
public class Room {

    List<Door> _door;

    public Room() {}

    public List<Door> get_door() {
        return _door;
    }

    public void set_door(List<Door> _door) {
        this._door = _door;
    }
}
