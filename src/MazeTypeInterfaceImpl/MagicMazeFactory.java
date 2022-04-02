package MazeTypeInterfaceImpl;

import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.MagicMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MagicMazeFactory implements MazeTypeFactoryInterface {

    @Override
    public List<MazeRoomInterface> makeRoom(int numberOfRooms) {
        return new MagicMazeRoom().createNumberOfRoomsInMaze(numberOfRooms);
    }

}
