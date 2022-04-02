package DriverClass;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MazeGame {


    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        List<Room> _roomLst = mazefactoryObj.makeRoom(numberOfRooms);
        _maze.setRooms(_roomLst);
        createDoorsForEachRoom(_roomLst);
        return _maze;
    }

    void createDoorsForEachRoom(List<Room> _roomLst){
        MazeDoorInterface _doorObj;
        for(Room _room : _roomLst){
            List<Door> roomDoors = _doorObj.createDoor();
        }
    }
}
