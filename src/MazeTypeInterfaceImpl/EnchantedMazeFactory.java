package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.EnchantedMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

/**
 * +
 * concrete implementation for maze type factory
 */
public class EnchantedMazeFactory implements MazeTypeFactoryInterface {


    private static EnchantedMazeFactory singletonInstance = null;

    private EnchantedMazeFactory() {
    }

    /**
     * +
     *
     * @return implementing singleton
     */
    public static MazeTypeFactoryInterface getMazeFactorySingletonInstance() {
        if (singletonInstance == null) {
            EnchantedMazeFactory.singletonInstance = new EnchantedMazeFactory();
        }
        return EnchantedMazeFactory.singletonInstance;
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
        return EnchantedMazeRoom.getEnchantedRoomFactorySingletonInstance().createNumberOfRoomsInMaze(numberOfRooms, doorsLayout, mazeDoorInterface);
    }


}
