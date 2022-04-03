package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.MagicMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MagicMazeFactory implements MazeTypeFactoryInterface {

    @Override
    public List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface) {
        return new MagicMazeRoom().createNumberOfRoomsInMaze(numberOfRooms, doorsLayout, mazeDoorInterface);
    }

}
