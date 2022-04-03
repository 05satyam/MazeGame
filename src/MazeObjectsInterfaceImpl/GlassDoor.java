package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Door;
import MazeObjectsInterface.MazeDoorInterface;

import java.util.List;

public class GlassDoor extends  Door implements MazeDoorInterface {
    @Override
    public List<Door> createDoor(int layout) {
        return null;
    }

    @Override
    public List<Door> createDoorLayoutForRoom(int doorsLayout,  boolean isEvenRowOddRoom) {
        return null;
    }
}
