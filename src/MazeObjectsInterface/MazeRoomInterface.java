package MazeObjectsInterface;

import MazeConcreteObjects.Room;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;

import java.util.List;

public interface MazeRoomInterface extends MapSiteBaseInterfaceClass {

     public abstract List<Room> createRoom();
}
