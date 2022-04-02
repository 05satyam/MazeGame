package MazeTypeInterface;

import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.List;

public interface MazeTypeFactoryInterface {


    List<Room> makeRoom(int numberOfRooms);


    default Maze makeMaze(int numberOfRooms, MazeTypeFactoryInterface mazeTypeFactoryobj) {
        return  new Maze().makeMaze(numberOfRooms);
    };


}
