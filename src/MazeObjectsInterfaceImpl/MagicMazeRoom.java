package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;

import java.util.ArrayList;
import java.util.List;

public class MagicMazeRoom extends Room implements MazeRoomInterface {

    private static MagicMazeRoom singletonInstance = null;

    private MagicMazeRoom() {
    }

    public static MagicMazeRoom getMagicMazeRoomFactorySingletonInstance() {
        if (singletonInstance == null) {
            MagicMazeRoom.singletonInstance = new MagicMazeRoom();
        }
        return MagicMazeRoom.singletonInstance;
    }

    /**
     * +
     *
     * @param numberOfRooms        :  number of rooms in the maze
     * @param doorsLayout          :  what layput is required by user:  Layout1 or Layout 2. as per documentations
     * @param mazeDoorInterfaceObj : door interface object which consist of runtime child object.
     * @return this method will create number of rooms in the maze.
     * Also this method is assigning doors to the each room depending on the layoyt choosen by the client.
     */
    @Override
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterfaceObj) {
        List<Room> _rLst = new ArrayList<>();
        for (int ii = 0; ii < numberOfRooms * numberOfRooms; ii++) {
            _rLst.add(new Room());
        }
        System.out.println("inside make room of enchanted maze " + _rLst.size());
        boolean isEvenRowOddRooms = false;
        int currentRoomNo = 0;
        for (int i = 0; i < numberOfRooms; i++) {
            for (int j = 0; j < numberOfRooms; j++) {
                Room _r = EnchantedMazeRoom.getEnchantedRoomFactorySingletonInstance();
                //skip if (row is even and room is even) || (row is odd and room is odd)
                if (doorsLayout == 2) { // only required for layout 2
                    if (i % 2 == 0 && j % 2 == 0) {
                        currentRoomNo++;
                        continue;
                    }
                    //else contiue for all other configuration
                    if ((i % 2 == 0) && (j % 2 != 0))
                        isEvenRowOddRooms = true;
                    else isEvenRowOddRooms = false;
                }

                mazeDoorInterfaceObj.createDoorLayoutForRoom(doorsLayout, isEvenRowOddRooms, _rLst, numberOfRooms, currentRoomNo);
                currentRoomNo++;
            }
        }
        System.out.println("room list wil be " + _rLst.size());
        return _rLst;
    }
}
