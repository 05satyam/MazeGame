package MazeTypeInterface;

import MazeConcreteObjects.Maze;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.List;

public interface MazeTypeFactoryInterface {


    List<MazeRoomInterface> makeRoom(int numberOfRooms);


    default Maze makeMaze(int numberOfRooms, MazeTypeFactoryInterface mazeTypeFactoryobj) {
        return  new Maze().makeMaze(numberOfRooms);
    };


}
