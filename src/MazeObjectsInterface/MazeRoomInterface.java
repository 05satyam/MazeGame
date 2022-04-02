package MazeObjectsInterface;

import MazeConcreteObjects.Room;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;

import java.util.List;

public interface MazeRoomInterface extends MapSiteBaseInterfaceClass {

    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms);
}
