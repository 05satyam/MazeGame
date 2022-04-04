package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterfaceImpl.MagicMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

/**
 * +
 * concrete implementation for maze type factory
 */
public class MagicMazeFactory implements MazeTypeFactoryInterface {


    private static MagicMazeFactory singletonInstance = null;

    private MagicMazeFactory() {
    }

    /**
     * +
     *
     * @return singleton implementation
     */
    public static MazeTypeFactoryInterface getMazeFactorySingletonInstance() {
        if (singletonInstance == null) {
            MagicMazeFactory.singletonInstance = new MagicMazeFactory();
        }
        return MagicMazeFactory.singletonInstance;
    }


    /**
     * +
     *
     * @param numberOfRooms
     * @param doorsLayout
     * @param mazeDoorInterface
     * @return this method will return the list of rooms for the maze
     */
    @Override
    public List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface) {
        return MagicMazeRoom.getMagicMazeRoomFactorySingletonInstance()
                .createNumberOfRoomsInMaze(numberOfRooms, doorsLayout, mazeDoorInterface);
    }

}
