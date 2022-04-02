package MazeObjectsInterface;

import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;

import java.util.List;

public interface MazeRoomInterface extends MapSiteBaseInterfaceClass {

    public List<MazeRoomInterface> createNumberOfRoomsInMaze(int numberOfRooms);
}
