package DriverClass;

import MazeConcreteObjects.Maze;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MazeGame {


    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        List<MazeRoomInterface> _roomLst = mazefactoryObj.makeRoom(numberOfRooms);
        _maze.setRooms(_roomLst);

        return _maze;
    }
}
