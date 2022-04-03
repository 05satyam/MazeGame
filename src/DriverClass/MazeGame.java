package DriverClass;

import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeDoorLayoutEnums.DoorTypeToUserChoiceEnum;
import MazeObjectsInterface.MazeDoorInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

public class MazeGame {


    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj, int doorType, int layout){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        MazeDoorInterface mazeDoorInterface = getDoorConcreteClassForRoom(doorType, layout);
        List<Room> _roomLst = mazefactoryObj.makeRoom(numberOfRooms, layout, mazeDoorInterface);
        _maze.setRooms(_roomLst);
        return _maze;
    }

    MazeDoorInterface getDoorConcreteClassForRoom(int doorType, int layout){
        String doorTypeConcreteImplName = DoorTypeToUserChoiceEnum.getDoorInterfaceNameFromSeqChoice(doorType);
        return MazeDoorInterface.getDoorInterfaceFromDoorChoice(doorTypeConcreteImplName);
    }

}
