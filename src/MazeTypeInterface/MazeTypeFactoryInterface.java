package MazeTypeInterface;

import MazeConcreteObjects.Maze;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;

public interface MazeTypeFactoryInterface {


    MazeRoomInterface makeRoom();

    MazeDoorInterface makeDoor() ;

    default Maze makeMaze(int numberOfRooms, MazeTypeFactoryInterface mazeTypeFactoryobj) {
        return  new Maze().makeMaze(numberOfRooms);
    };
}
