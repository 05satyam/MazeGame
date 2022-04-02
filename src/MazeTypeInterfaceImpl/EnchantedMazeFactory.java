package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.EnchantedMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class EnchantedMazeFactory implements MazeTypeFactoryInterface {


    @Override
    public List<Room> makeRoom(int numberOfRooms) {
        return new EnchantedMazeRoom().createNumberOfRoomsInMaze(numberOfRooms);
    }


}
