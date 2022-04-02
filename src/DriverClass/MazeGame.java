package DriverClass;

import MazeConcreteObjects.Maze;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

public class MazeGame {


    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        MazeRoomInterface room1 = mazefactoryObj.makeRoom();
        MazeDoorInterface door = mazefactoryObj.makeDoor();

        return _maze;
    }
}
