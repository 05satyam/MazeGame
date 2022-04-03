package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.EnchantedMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class EnchantedMazeFactory implements MazeTypeFactoryInterface {

    @Override
    public List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface) {
        return new EnchantedMazeRoom().createNumberOfRoomsInMaze(numberOfRooms, doorsLayout, mazeDoorInterface);
    }



}
