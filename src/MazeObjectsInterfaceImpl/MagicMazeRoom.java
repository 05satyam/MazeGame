package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;

import java.util.ArrayList;
import java.util.List;

public class MagicMazeRoom extends Room implements MazeRoomInterface {


   @Override
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms) {
        List<Room> _rLst = new ArrayList<>();
        for (int i = 0; i < numberOfRooms * numberOfRooms; i++) {
            Room _r = new MagicMazeRoom();
            _rLst.add(_r);
        }
        return _rLst;
    }
}
