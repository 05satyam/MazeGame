package MazeConcreteObjects;

import java.util.ArrayList;
import java.util.List;

/*
 * one room will have 4 doors and depending on layout we are going to assign doors to a room
 * For Layout 1 we will be assigning doors in random fashinm
 * */

/**+
 * It is a ROOM class for the maze. It consist of parameters required for the room and it is a concrete object
 *
 * Room has list of doors which means number and type of doors in which direction room have.
 * It is kind of DAO class
 */
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
