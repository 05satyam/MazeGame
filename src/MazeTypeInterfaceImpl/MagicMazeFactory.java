package MazeTypeInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeObjectsInterfaceImpl.MagicMazeRoom;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

/**+
 * concrete implementation for maze type factory
 */
public class MagicMazeFactory implements MazeTypeFactoryInterface {

    /**+
     *
     * @param numberOfRooms
     * @param doorsLayout
     * @param mazeDoorInterface
     * @return
     *
     * this method will return the list of rooms for the maze
     */
    @Override
    public List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface) {
        return new MagicMazeRoom().createNumberOfRoomsInMaze(numberOfRooms, doorsLayout, mazeDoorInterface);
    }

}
