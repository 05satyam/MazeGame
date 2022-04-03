package MazeTypeInterface;

import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.List;

public interface MazeTypeFactoryInterface {


    /**+
     *
     * @param numberOfRooms
     * @param doorsLayout
     * @param mazeDoorInterface
     * @return
     */
    List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface);

    /**+
     *
     * @param numberOfRooms
     * @param mazeTypeFactoryobj
     * @return
     *
     * it is a default method for maze as initializing rooms in a maze remains same for all type of maze in my implementation
     */
    default Maze makeMaze(int numberOfRooms, MazeTypeFactoryInterface mazeTypeFactoryobj) {
        return new Maze().makeMaze(numberOfRooms);
    }

    ;


}
