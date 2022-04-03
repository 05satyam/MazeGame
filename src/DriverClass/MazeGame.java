package DriverClass;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeDoorLayoutEnums.DoorTypeToUserChoiceEnum;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MazeGame {


    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj, int doorType){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        List<Room> _roomLst = mazefactoryObj.makeRoom(numberOfRooms);
        _maze.setRooms(_roomLst);
        createDoorsForEachRoom(_roomLst, doorType);
        return _maze;
    }

    void createDoorsForEachRoom(List<Room> _roomLst, int doorType){
        String doorTypeConcreteImplName = DoorTypeToUserChoiceEnum.getDoorInterfaceNameFromSeqChoice(doorType);
        for(Room _room : _roomLst){
            List<Door> roomDoors = MazeDoorInterface.getDoorInterfaceFromDoorChoice(doorTypeConcreteImplName).createDoor();
        }
    }

}
