package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class EnchantedMazeRoom extends Room implements MazeRoomInterface {

    @Override
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms) {
        List<Room> _rLst = new ArrayList<>();
        for (int i = 0; i < numberOfRooms * numberOfRooms; i++) {
            Room _r = new EnchantedMazeRoom();
            _rLst.add(_r);
        }
        return _rLst;
    }

}
