package MazeObjectsInterface;

import MazeConcreteObjects.Room;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;

import java.util.List;

public interface MazeRoomInterface extends MapSiteBaseInterfaceClass {
    /**
     * +
     *
     * @param numberOfRooms        : number of rooms
     * @param doorLayout           : it will tell you about doors layoyt like layout 1 or layoyt 2
     * @param mazeDoorInterfaceObj : it is maze interface object
     * @return
     */
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms, int doorLayout, MazeDoorInterface mazeDoorInterfaceObj);
}
