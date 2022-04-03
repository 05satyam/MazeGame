package MazeTypeInterface;

import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.List;

public interface MazeTypeFactoryInterface {


    List<Room> makeRoom(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterface);


    default Maze makeMaze(int numberOfRooms, MazeTypeFactoryInterface mazeTypeFactoryobj) {
        return  new Maze().makeMaze(numberOfRooms);
    };


}
