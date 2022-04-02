package MazeTypeInterfaceImpl;

import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.EnchantedMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class EnchantedMazeFactory implements MazeTypeFactoryInterface {


    @Override
    public List<MazeRoomInterface> makeRoom(int numberOfRooms) {
        return new EnchantedMazeRoom().createNumberOfRoomsInMaze(numberOfRooms);
    }


}
