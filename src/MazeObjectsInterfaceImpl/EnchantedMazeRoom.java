package MazeObjectsInterfaceImpl;

import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class EnchantedMazeRoom implements MazeRoomInterface {

    @Override
    public List<MazeRoomInterface> createNumberOfRoomsInMaze(int numberOfRooms) {
        List<MazeRoomInterface> _rLst = new ArrayList<>();
        for (int i = 0; i < numberOfRooms * numberOfRooms; i++) {
            EnchantedMazeRoom _r = new EnchantedMazeRoom();
            _rLst.add(_r);
        }
        return _rLst;
    }

}
