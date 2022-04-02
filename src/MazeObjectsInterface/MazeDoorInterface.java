package MazeObjectsInterface;

import MazeConcreteObjects.Door;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;

import java.util.List;

public interface MazeDoorInterface extends MapSiteBaseInterfaceClass {
    public List<Door> createDoor();
}
