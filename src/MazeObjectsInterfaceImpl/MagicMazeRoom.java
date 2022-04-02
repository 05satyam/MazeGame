package MazeObjectsInterfaceImpl;

import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;

import java.util.ArrayList;
import java.util.List;

public class MagicMazeRoom implements MazeRoomInterface {


   @Override
    public List<MazeRoomInterface> createNumberOfRoomsInMaze(int numberOfRooms) {
        List<MazeRoomInterface> _rLst = new ArrayList<>();
        for (int i = 0; i < numberOfRooms * numberOfRooms; i++) {
            MagicMazeRoom _r = new MagicMazeRoom();
            _rLst.add(_r);
        }
        return _rLst;
    }
}
