package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Door;
import MazeObjectsInterface.MazeDoorInterface;

import java.util.List;

public class BombDoor extends  Door implements MazeDoorInterface{
    @Override
    public List<Door> createDoor() {
        return null;
    }
}
